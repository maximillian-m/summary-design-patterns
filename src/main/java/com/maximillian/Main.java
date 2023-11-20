package com.maximillian;

import com.maximillian.Observer_Pattern.Interfaces.Subject;
import com.maximillian.Observer_Pattern.classes.CurrentConditionDisplay;
import com.maximillian.Observer_Pattern.classes.WeatherData;
import com.maximillian.design_pattern_intro_And_Strategy_Pattern.Ducks.Duck;
import com.maximillian.design_pattern_intro_And_Strategy_Pattern.Ducks.MallardDuck;
import com.maximillian.design_pattern_intro_And_Strategy_Pattern.Ducks.ModelDuck;
import com.maximillian.design_pattern_intro_And_Strategy_Pattern.Fly.FlyWithRockets;

public class Main {
    public static void main(String[] args) {
//        Duck mallardDuck = new MallardDuck();
//        mallardDuck.performFly();
//        mallardDuck.performQuack();
//
//        Duck modelDuck = new ModelDuck();
//        modelDuck.performQuack();
//        modelDuck.performFly();// initial fly behaviour says it cannot fly
//        modelDuck.setFlyBahaviour(new FlyWithRockets());//here I set to set the flying capability at runtime
//        modelDuck.performFly();

        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay display = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}