package com.coolweather.luowz.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by luowz on 2017/4/22.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;
    }
}
