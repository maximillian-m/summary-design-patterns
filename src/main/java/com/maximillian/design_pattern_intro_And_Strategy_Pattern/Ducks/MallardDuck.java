package com.maximillian.design_pattern_intro_And_Strategy_Pattern.Ducks;

import com.maximillian.design_pattern_intro_And_Strategy_Pattern.Fly.FlyWithWings;
import com.maximillian.design_pattern_intro_And_Strategy_Pattern.quack.Quack;

public class MallardDuck extends Duck{
    public MallardDuck(){
        quackBehaviour = new Quack();
        flyBahaviour = new FlyWithWings();
    }

    @Override
   public void swim() {
        System.out.println("Mallard duck swims");
    }

    @Override
   public void display() {

    }
}
