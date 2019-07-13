package com.tan.forfun.observer;

import com.tan.forfun.observer.display.CurrentConditionsDisplay;
import com.tan.forfun.observer.subject.WeatherDate;

class WeatherStation {
    public static void main(String[] args) {
        WeatherDate weatherData = new WeatherDate();
        CurrentConditionsDisplay currentDisplay =
                new CurrentConditionsDisplay(weatherData);
//        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
//        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurements("80", "65", "30.4");
        weatherData.setMeasurements("82", "70", "29.2");
        weatherData.setMeasurements("78", "90", "29.2");
    }
}
