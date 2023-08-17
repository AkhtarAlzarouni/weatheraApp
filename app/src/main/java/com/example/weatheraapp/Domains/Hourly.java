package com.example.weatheraapp.Domains;

public class Hourly {
    private String Hour;
    private  int temp;
    private String picPatn;

    public Hourly(String hour,int temp, String picPatn){
        Hour=hour;
        this.temp=temp;
        this.picPatn=picPatn;
    }

    public String getHour() {
        return Hour;
    }

    public void setHour(String hour) {
        Hour = hour;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public String getPicPatn() {
        return picPatn;
    }

    public void setPicPatn(String picPatn) {
        this.picPatn = picPatn;
    }
}
