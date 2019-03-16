package com.codeking123.android.quakereport;

public class Earthquake {
    private  final double mMagnitude;
    private  final String mLocation;
    private final long mDate;
    private final String murl;

    public Earthquake(double magnitude, String location, long date,String murl) {
       this.mMagnitude = magnitude;
       this.mLocation = location;
       this.mDate = date;
       this.murl=murl;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public long getDate() {
        return mDate;
    }
    public  String getMurl(){
        return murl;
    }
}
