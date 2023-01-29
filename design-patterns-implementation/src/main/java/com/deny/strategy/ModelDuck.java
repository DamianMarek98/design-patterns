package com.deny.strategy;

import com.deny.strategy.fly.FlyNoWay;
import com.deny.strategy.quack.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        setFlyBehaviour(new FlyNoWay());
        setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
