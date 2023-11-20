package com.maximillian.Observer_Pattern.classes;

import com.maximillian.Observer_Pattern.Interfaces.Observer;
import com.maximillian.Observer_Pattern.Interfaces.Subject;

import javax.management.openmbean.InvalidOpenTypeException;
import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> observerList;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observerList = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
         int i =   this.observerList.indexOf(observer);
         observerList.remove(i);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observerList){
            observer.update(temperature, humidity, pressure);
        }
    }
    public void measurementsChanged(){
        notifyObservers();
    }
    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();// here the measurementChanged will notify the
        // observers with the new values that are passed in this set measurements
    }
}
