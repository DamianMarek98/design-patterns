package com.deny.decorator.condiment;

import com.deny.decorator.coffe.Beverage;

public abstract class CondimentDecorator extends Beverage {

    protected CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    Beverage beverage;
    public abstract String getDescription();
}
