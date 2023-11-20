package com.maximillian.design_pattern_intro_And_Strategy_Pattern.Ducks;

import com.maximillian.design_pattern_intro_And_Strategy_Pattern.Fly.FlyBahaviour;
import com.maximillian.design_pattern_intro_And_Strategy_Pattern.quack.QuackBehaviour;

public abstract class Duck {


    QuackBehaviour quackBehaviour;
    FlyBahaviour flyBahaviour;

    public Duck() {
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void setFlyBahaviour(FlyBahaviour flyBahaviour) {
        this.flyBahaviour = flyBahaviour;
    }
    public void swim(){
        System.out.println("All ducks can swim and float");
    }
    abstract void display();
   public void performQuack(){
        quackBehaviour.makeSound();
    }
   public void performFly(){
        flyBahaviour.fly();
    }


}
