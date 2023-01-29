package com.deny.strategy;

import com.deny.strategy.fly.FlyWithWings;
import com.deny.strategy.quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        setQuackBehavior(new Quack());
        setFlyBehaviour(new FlyWithWings());
    }

    @Override
    public void display() {
        System.out.println("Mallard duck!");
    }
}
