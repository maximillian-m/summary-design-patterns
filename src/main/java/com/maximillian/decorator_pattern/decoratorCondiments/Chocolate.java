package com.maximillian.decorator_pattern.decoratorCondiments;

import com.maximillian.decorator_pattern.CoffeeTypes.Coffee;

public class Chocolate extends DecoratorComponents {
    private Coffee coffee;
    public Chocolate(Coffee coffee){
        this.coffee = coffee;
    }
    @Override
    public double getCost() {
        return coffee.getCost() + 2.01;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", chocolate";
    }
}
