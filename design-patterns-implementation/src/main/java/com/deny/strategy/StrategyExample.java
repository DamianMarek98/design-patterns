package com.deny.strategy;

import com.deny.ImplementationExample;
import com.deny.strategy.fly.FlyRocketPowered;

public class StrategyExample implements ImplementationExample {
    @Override
    public void start() {
        // example of building object with two strategies composition and one basic behavior inheritance
        // creating objects of typ duck could be done by duck factory which could compose objects via duck builder,
        // but this is just an example of strategy pattern and composition over inheritance
        Duck mallard = new MallardDuck();
        mallard.performQuack(); //composition
        mallard.performFly(); //composition
        mallard.swim(); //inheritance

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly(); //base flying from constructor
        modelDuck.setFlyBehaviour(new FlyRocketPowered()); //changing flying strategy
        modelDuck.performFly();
    }
}
