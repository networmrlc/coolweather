package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2018\12\28 0028.
 */

public class Basic {
    @SerializedName("cid")
    public String weatherId;
    @SerializedName("location")
    public String cityName;
    @SerializedName("parent_city")
    public String parentCity;
    @SerializedName("admin_area")
    public String adminArea;
    @SerializedName("cnty")
    public String country;
    public String lat;
    public String lon;
    public String tz;
}
