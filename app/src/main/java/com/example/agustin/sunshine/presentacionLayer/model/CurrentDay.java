package com.example.agustin.sunshine.presentacionLayer.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by agustin on 27/01/16.
 */
public class CurrentDay {

    @JsonProperty("main")
    private MainWeatherValues mainWeatherValues;

    @JsonProperty("wheather")
    private MainwheatherDescription mainwheatherDescription;

    private String date;

    @JsonProperty("cod")
    private String errorCode;

    private RainState rain;


    protected class RainState {

        @JsonProperty("3h")
        String rainProbability;
    }

    public String getChancesOfRainning() {
        return rain.rainProbability;
    }

    public MainWeatherValues getMainWeatherValues() {
        return mainWeatherValues;
    }

    public void setMainWeatherValues(MainWeatherValues mainWeatherValues) {
        this.mainWeatherValues = mainWeatherValues;
    }

    public MainwheatherDescription getMainwheatherDescription() {
        return mainwheatherDescription;
    }

    public void setMainwheatherDescription(MainwheatherDescription mainwheatherDescription) {
        this.mainwheatherDescription = mainwheatherDescription;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public RainState getRain() {
        return rain;
    }

    public void setRain(RainState rain) {
        this.rain = rain;
    }
}
