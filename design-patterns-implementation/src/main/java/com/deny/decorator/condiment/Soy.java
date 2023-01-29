package com.deny.decorator.condiment;

import com.deny.decorator.coffe.Beverage;

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return beverage.cost() + .15;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", soy";
    }
}
