package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Administrator on 2018\12\28 0028.
 */

public class Weather {
    public String status;
    public Basic basic;
    public Update update;
    public Now now;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
