package com.company;

import java.sql.Date;

public class Weather {
    private int id;
    private String region;
    private String date;
    private int  temp;
    private int fallout;

    public Weather(){

    }
    public Weather(String rg,String dt, int t,int fl)
    {
        this.region=rg;
        this.date=dt;
        this.temp=t;
        this.fallout=fl;
    }

    //GETTER
    public int getId(){return id;}
    public String getRegion(){
        return region;
    }
    public String getDate(){
        return date;
    }
    public int getTemp(){
        return temp;
    }
    public int getFallout(){
        return fallout;
    }

    // SETTER
    public void setRegion(String rg){
        this.region=rg;
    }
    public void setDate(String dt){
        this.date=dt;
    }
    public void setTemp(int t){
        this.temp=t;
    }
    public void setFallout(int fl){
        this.fallout=fl;
    }



}
