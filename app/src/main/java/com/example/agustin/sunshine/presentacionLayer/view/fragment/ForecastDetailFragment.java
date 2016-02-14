package com.example.agustin.sunshine.presentacionLayer.view.fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.agustin.sunshine.R;
import com.example.agustin.sunshine.presentacionLayer.model.ForeCastDayly;
import com.example.agustin.sunshine.presentacionLayer.model.WeatherApi;

/**
 * Created by agustin on 13/09/15.
 */
public class ForecastDetailFragment extends Fragment {
    public ForecastDetailFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_forecast_detail, container, false);
        TextView mornTemp=(TextView)rootView.findViewById(R.id.detail_description_title);
        TextView eveTemp=(TextView)rootView.findViewById(R.id.detail_description);
        TextView nightTemp=(TextView)rootView.findViewById(R.id.detail_temperature_list);

        Bundle extras=this.getActivity().getIntent().getExtras();
       ForeCastDayly currentForecast=extras.getParcelable(WeatherApi.getSelectedForecast());

        mornTemp.setText(currentForecast.getTempMorning());
        eveTemp.setText(currentForecast.getTempEve());
        nightTemp.setText(currentForecast.getTempNight());

        return rootView;
    }

}

