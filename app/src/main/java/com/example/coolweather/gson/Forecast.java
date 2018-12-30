package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2018\12\30 0030.
 */

public class Forecast {
    public String date;
    @SerializedName("tmp_max")
    public String max;

    @SerializedName("tmp_min")
    public String min;

    @SerializedName("cond_txt_d")
    public String info;
}
