package com.tan.forfun.observer.subject;

import com.tan.forfun.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherDate implements Subject {

    private List<Observer> observers;

    private String temp ;

    private String humidity ;

    private String  pressure ;

    public WeatherDate() {
        this.observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i>0)
            observers.remove(i);

    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = observers.get(i);
            observer.update(temp, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }
    public void setMeasurements(String temp, String humidity, String pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
