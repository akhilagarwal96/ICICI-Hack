package com.akhilagarwal96.icicihack;

/**
 * Created by Adm on 18-Apr-17.
 */

public class DataProviderGps {

    public DataProviderGps(String latitude, String longitude, String atm) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.atm = atm;
    }

    String latitude,longitude,atm;

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getAtm() {
        return atm;
    }

    public void setAtm(String atm) {
        this.atm = atm;
    }
}
