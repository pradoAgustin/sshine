package com.example.agustin.sunshine.presentacionLayer.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by agustin on 10/01/16.
 */
public class MainForecastSearchResponse {
    @JsonProperty("dt")
    private String date;

    @JsonProperty("cod")
    private String errorCode;

    @JsonProperty ("temp")
    private String temperature;

    @JsonProperty ("morn")
    private String morning;

    @JsonProperty ("eve")
    private String evenning;

    @JsonProperty("desc")
    private String description;

    @JsonProperty("name")
    private String cityName;

    private String night;
    private String list;
    private String message;



    public String getMessage() {
        return message;
    }

    public String getNight() {
        return night;
    }

    public String getList() {
        return list;
    }

    public String getDescription() {
        return description;
    }

    public String getEvenning() {
        return evenning;
    }

    public String getMorning() {
        return morning;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getCityName() {
        return cityName;
    }
}
