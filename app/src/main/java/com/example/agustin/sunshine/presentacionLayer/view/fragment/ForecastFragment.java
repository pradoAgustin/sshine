package com.example.agustin.sunshine.presentacionLayer.view.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.agustin.sunshine.R;
import com.example.agustin.sunshine.presentacionLayer.model.ForeCastDayly;
import com.example.agustin.sunshine.presentacionLayer.model.ForecastJsonParser;
import com.example.agustin.sunshine.presentacionLayer.model.WeatherApi;
import com.example.agustin.sunshine.presentacionLayer.view.activity.ForecastDetailActivity;

import org.json.JSONException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

/**
 * A placeholder fragment containing a simple view.
 */
public  class ForecastFragment extends Fragment {
    private ForecastAdapter forecastAdapter;
    private ArrayList<ForeCastDayly> weekForecast;

    public ForecastFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        final ListView forecastList = (ListView) rootView.findViewById(R.id.listView_forecast);
        FetchWeatherTask fetchWeatherTask = new FetchWeatherTask();
        fetchWeatherTask.execute(WeatherApi.getStringUrlBsAs().toString());
        forecastAdapter = new ForecastAdapter(getActivity(), R.layout.list_item_forecast, R.id.list_item_forecast_date);
        forecastList.setAdapter(forecastAdapter);
        forecastList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ForeCastDayly selectedForecast = forecastAdapter.getItem(position);
                Intent intent = new Intent(getActivity(), ForecastDetailActivity.class);
                Bundle bundle = new Bundle();
                bundle.putParcelable(WeatherApi.getSelectedForecast(), selectedForecast);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        return rootView;
    }

    class FetchWeatherTask extends AsyncTask<String, Void, ArrayList<ForeCastDayly>> {


        @Override
        protected ArrayList<ForeCastDayly> doInBackground(String... params) {
            HttpURLConnection urlConnection = null;
            BufferedReader reader = null;
            String forecastJson = null;

            try {
                URL url = new URL(WeatherApi.getStringUrlBsAs().toString());

                urlConnection = (HttpURLConnection) url.openConnection();
                urlConnection.setRequestMethod(WeatherApi.getGetRequest());
                urlConnection.connect();

                //read from json
                InputStream inputStream = urlConnection.getInputStream();
                StringBuffer buffer = new StringBuffer();
                if (inputStream == null) {
                    return null;
                }
                reader = new BufferedReader(new InputStreamReader(inputStream));
                String line;
                while ((line = reader.readLine()) != null) {
                    buffer.append(line + "\n");
                }
                if (buffer.length() == 0) {
                    return null;
                }

                forecastJson = buffer.toString();

            } catch (Exception e) {
                e.printStackTrace();
                return null;
            } finally {
                if (urlConnection != null) {
                    urlConnection.disconnect();
                }
                if (reader != null) {
                    try {
                        reader.close();
                    } catch (final IOException e) {
                        e.printStackTrace();
                        return null;
                    }
                }
            }
            try {
                return ForecastJsonParser.getInstanceOf().getWeekForecast(forecastJson);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(ArrayList<ForeCastDayly> jsonWeekForecast) {

            forecastAdapter.addAll(jsonWeekForecast);
        }
    }

    protected class ForecastAdapter extends ArrayAdapter<ForeCastDayly> {

        public ForecastAdapter(Context context, int resource, int textViewResourceId) {
            super(context, resource, textViewResourceId);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder holder;
            if (convertView == null) {
                convertView = LayoutInflater.from(this.getContext())
                        .inflate(R.layout.list_item_forecast, parent, false);
                holder = new ViewHolder();

                holder.basicState = (TextView) convertView.findViewById(R.id.list_item_forecast_date);

                convertView.setTag(holder);

            } else {
                /**
                 * Bind the data efficiently with the holder.
                 */
                holder = (ViewHolder) convertView.getTag();
            }
            ForeCastDayly currentForectast = this.getItem(position);
            holder.basicState.setText(currentForectast.basicState());
            return convertView;
        }

    }
}