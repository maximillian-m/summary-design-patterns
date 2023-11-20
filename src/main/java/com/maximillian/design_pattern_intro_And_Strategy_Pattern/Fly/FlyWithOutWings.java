package com.maximillian.design_pattern_intro_And_Strategy_Pattern.Fly;

public class FlyWithOutWings implements FlyBahaviour {
    @Override
    public void fly() {
        System.out.println("Cannot fly");
    }
}
