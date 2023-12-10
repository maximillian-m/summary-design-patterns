package com.maximillian.decorator_pattern.CoffeeTypes;

import com.maximillian.decorator_pattern.CoffeeTypes.Coffee;

public class SweetenedBlend extends Coffee {
    public SweetenedBlend(){
        description = "Sweetened blend";
    }
    @Override
    public double getCost() {
        return 1.0;
    }
}
