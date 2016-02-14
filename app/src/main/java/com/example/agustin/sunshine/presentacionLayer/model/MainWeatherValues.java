package com.example.agustin.sunshine.presentacionLayer.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by agustin on 27/01/16.
 */
public class MainWeatherValues {

    @JsonProperty("temp")
    private String temperature;

    private String humidity;

    private String pressure;

    @JsonProperty("temp_min")
    private String minTemperature;

    @JsonProperty("temp_max")
    private String maxTemperature;

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(String minTemperature) {
        this.minTemperature = minTemperature;
    }

    public String getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(String maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

}
