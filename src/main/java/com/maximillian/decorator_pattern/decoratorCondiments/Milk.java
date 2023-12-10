package com.maximillian.decorator_pattern.decoratorCondiments;

import com.maximillian.decorator_pattern.CoffeeTypes.Coffee;
import com.maximillian.decorator_pattern.decoratorCondiments.DecoratorComponents;

public class Milk extends DecoratorComponents {
    private Coffee coffee;
    public Milk(Coffee coffee){
        this.coffee = coffee;
    }
    @Override
    public double getCost() {
        return coffee.getCost() + 2.03;
    }
    @Override
    public String getDescription() {
        return coffee.getDescription() + ", milk";
    }
}
