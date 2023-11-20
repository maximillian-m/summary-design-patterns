package com.maximillian.design_pattern_intro_And_Strategy_Pattern.Ducks;

import com.maximillian.design_pattern_intro_And_Strategy_Pattern.Fly.FlyWithOutWings;
import com.maximillian.design_pattern_intro_And_Strategy_Pattern.quack.Quack;

public class ModelDuck extends Duck{
    //here we want to have a model duck that can be used to model the other remaining things.
    //now the duck's dynamic behaviours can be set on the fly.
    public ModelDuck(){
        flyBahaviour = new FlyWithOutWings();
        quackBehaviour = new Quack();
    }

    @Override
    void display() {
        System.out.println("I am a model duck");
    }
}
