package com.maximillian.design_pattern_intro_And_Strategy_Pattern.Fly;

public class FlyWithRockets implements FlyBahaviour{
    @Override
    public void fly() {
        System.out.println("I am flying with Rockets");
    }
}
