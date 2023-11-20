package com.maximillian.design_pattern_intro_And_Strategy_Pattern.quack;

public class MuteQuack implements QuackBehaviour{
    @Override
    public void makeSound() {
        System.out.println("This duck makes no sound");
    }
}
