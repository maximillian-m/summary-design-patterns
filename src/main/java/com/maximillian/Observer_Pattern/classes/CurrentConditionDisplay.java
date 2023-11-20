package com.maximillian.Observer_Pattern.classes;

import com.maximillian.Observer_Pattern.Interfaces.Display;
import com.maximillian.Observer_Pattern.Interfaces.Observer;
import com.maximillian.Observer_Pattern.Interfaces.Subject;

public class CurrentConditionDisplay implements Observer, Display {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("current conditions: " + temperature + " F degrees and" + humidity + "% humidity");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
            this.temperature = temperature;
            this.humidity = humidity;
            display();
    }
}
