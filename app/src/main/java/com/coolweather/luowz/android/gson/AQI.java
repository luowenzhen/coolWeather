package com.coolweather.luowz.android.gson;

/**
 * Created by luowz on 2017/4/22.
 */

public class AQI {
    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
