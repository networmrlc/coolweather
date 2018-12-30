package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2018\12\30 0030.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond_txt")
    public String info;
}
