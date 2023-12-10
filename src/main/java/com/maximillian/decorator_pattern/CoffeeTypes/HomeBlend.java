package com.maximillian.decorator_pattern.CoffeeTypes;

import com.maximillian.decorator_pattern.CoffeeTypes.Coffee;

public class HomeBlend extends Coffee {
    public HomeBlend(){
        description = "Home blend";
    }
    @Override
    public double getCost() {
        return 0.53;
    }
}
