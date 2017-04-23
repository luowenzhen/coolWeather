package com.coolweather.luowz.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by luowz on 2017/4/22.
 */

public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {
        public String max;
        public String min;
    }

    public class More {
        @SerializedName("txt_d")
        public String info;
    }
}
