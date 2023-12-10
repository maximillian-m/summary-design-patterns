package com.maximillian.decorator_pattern.CoffeeTypes;

public abstract class Coffee {
    String description = "unbranded coffee";
    public String getDescription(){
        return description;
    }

    public abstract double getCost();

}
