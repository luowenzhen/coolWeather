package com.coolweather.luowz.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by luowz on 2017/4/22.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }
}
