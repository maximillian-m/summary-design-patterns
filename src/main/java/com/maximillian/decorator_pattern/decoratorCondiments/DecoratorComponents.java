package com.maximillian.decorator_pattern.decoratorCondiments;

import com.maximillian.decorator_pattern.CoffeeTypes.Coffee;

public abstract class DecoratorComponents extends Coffee {
   public abstract String getDescription();
}
