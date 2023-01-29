package com.deny.strategy;

import com.deny.strategy.fly.FlyBehaviour;
import com.deny.strategy.quack.QuackBehavior;

public abstract class Duck {
    private FlyBehaviour flyBehaviour;
    private QuackBehavior quackBehavior;

    public abstract void display();

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float!");
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
