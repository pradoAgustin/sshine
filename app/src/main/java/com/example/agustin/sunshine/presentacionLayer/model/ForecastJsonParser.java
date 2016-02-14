package com.example.agustin.sunshine.presentacionLayer.model;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by agustin on 08/09/15.
 */
public class ForecastJsonParser {
         private static final String DATE="dt";
         private static final String LIST="list";
         private static final String TEMPERATURE="temp";
         private static final String MORN="morn";
         private static final String EVE="eve";
         private static final String NIGHT="night";
         private static final String WEATHER="weather";
         private static final String DESC="description";
         static ForecastJsonParser forecastJsonParser=null;

    public static ForecastJsonParser getInstanceOf(){
        if(forecastJsonParser==null){
            forecastJsonParser=new ForecastJsonParser();

        }
        return forecastJsonParser;
    }

     private String getReadableString(Long time){
        Date date=new Date(time*1000);
        SimpleDateFormat formatter=new SimpleDateFormat("E,MMM d");
        return formatter.format(date).toString();
    }

    public  ArrayList<ForeCastDayly> getWeekForecast(String json) throws JSONException {
        JSONObject forecastjson=new JSONObject(json);
        JSONArray weatherList=forecastjson.getJSONArray(LIST);
        ArrayList<ForeCastDayly>weekForecast=new ArrayList<>();

        for(int i=0;i<weatherList.length();i++){
            JSONObject currentTempObject=weatherList.getJSONObject(i);
            ForeCastDayly weekOfDay=new ForeCastDayly();
            weekOfDay.description=getListWeatherJson(currentTempObject.getJSONArray(WEATHER));
            weekOfDay.date=getReadableString(currentTempObject.getLong(DATE));
            weekOfDay.tempMorning=currentTempObject.getJSONObject(TEMPERATURE).getDouble(MORN);
            weekOfDay.tempEve=currentTempObject.getJSONObject(TEMPERATURE).getDouble(EVE);
            weekOfDay.tempNight=currentTempObject.getJSONObject(TEMPERATURE).getDouble(NIGHT);
            weekForecast.add(weekOfDay);


        }

        return weekForecast;
    }

    private String getListWeatherJson(JSONArray jsonArray) {
        try {
           return  jsonArray.getJSONObject(0).getString(DESC);
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }


}
