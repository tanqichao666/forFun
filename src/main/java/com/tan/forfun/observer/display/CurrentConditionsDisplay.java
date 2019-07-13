package com.tan.forfun.observer.display;

import com.tan.forfun.observer.Observer;
import com.tan.forfun.observer.subject.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private String temperature;
    private String humidity;
    private Subject weatherData;
    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(String temp, String humidity, String pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
