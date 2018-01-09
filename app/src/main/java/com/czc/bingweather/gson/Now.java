package com.czc.bingweather.gson;

import com.google.gson.annotations.SerializedName;

public class Now {
    
    @SerializedName("tmp")
    public String temperature;
    
    @SerializedName("cond_txt")
    public String info;
    
    public String fl;
    public String wind_dir;
    public String wind_sc;
    public String wind_spd;
    public String hum;
    public String pcpn;
    public String pres;
    
    
}
