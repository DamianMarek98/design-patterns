package com.deny.strategy.fly;

public class FlyRocketPowered implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Flying like a rocket!");
    }
}
