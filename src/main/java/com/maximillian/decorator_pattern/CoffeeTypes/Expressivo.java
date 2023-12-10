package com.maximillian.decorator_pattern.CoffeeTypes;

import com.maximillian.decorator_pattern.CoffeeTypes.Coffee;

public class Expressivo extends Coffee {
    public Expressivo(){
        description = "Expressivo";
    }
    @Override
    public double getCost() {
        return 5.8;
    }
}
