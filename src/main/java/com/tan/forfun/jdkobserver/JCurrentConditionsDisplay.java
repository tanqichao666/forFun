package com.tan.forfun.jdkobserver;

import com.tan.forfun.observer.display.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class JCurrentConditionsDisplay implements Observer, DisplayElement {

    private String temperature;
    private String humidity;
    private Observable observable;

    public JCurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(Observable o, Object arg) {
        this.observable = o;
        if(o instanceof JWeatherData){
            JWeatherData weatherData = (JWeatherData)o;
            this.temperature = weatherData.getTemp();
            this.humidity = weatherData.getHumidity();
            this.display();
        }
    }
}
