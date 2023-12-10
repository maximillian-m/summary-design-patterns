package com.maximillian;

import com.maximillian.decorator_pattern.decoratorCondiments.Chocolate;
import com.maximillian.decorator_pattern.CoffeeTypes.Coffee;
import com.maximillian.decorator_pattern.CoffeeTypes.Expressivo;
import com.maximillian.decorator_pattern.decoratorCondiments.Milk;

import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        Duck mallardDuck = new MallardDuck();
//        mallardDuck.performFly();
//        mallardDuck.performQuack();
//
//        Duck modelDuck = new ModelDuck();
//        modelDuck.performQuack();
//        modelDuck.performFly();// initial fly behaviour says it cannot fly
//        modelDuck.setFlyBahaviour(new FlyWithRockets());//here I set to set the flying capability at runtime
//        modelDuck.performFly();
//
//        WeatherData weatherData = new WeatherData();
//        CurrentConditionDisplay display = new CurrentConditionDisplay(weatherData);
//        weatherData.setMeasurements(80, 65, 30.4f);
//        weatherData.setMeasurements(82, 70, 29.2f);
//        weatherData.setMeasurements(78, 90, 29.2f);
        Coffee coffee = new Expressivo();
        System.out.println(coffee.getDescription() +", " + "$" + coffee.getCost());

        Coffee milkExpressivoTopping = new Milk(coffee);
        System.out.println(milkExpressivoTopping.getDescription() + ", " + "$" + milkExpressivoTopping.getCost());

        milkExpressivoTopping = new Chocolate(milkExpressivoTopping);
        System.out.println(milkExpressivoTopping.getDescription() + ", " + "$" + milkExpressivoTopping.getCost());

        String okayOkay = "Hello hello";
        byte [] bytes = okayOkay.getBytes();

        InputStream inputStream = new FileInputStream(new BufferedInputStream(new FileInputStream(new File(new ByteArrayInputStream(bytes).toString()))).toString());
    }
}