package com.tan.forfun.jdkobserver;

import java.util.Observable;

public class JWeatherData extends Observable {

    private String temp ;

    private String humidity ;

    private String  pressure ;

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }
    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }
    public void setMeasurements(String temp, String humidity, String pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
