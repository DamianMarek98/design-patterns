package com.deny.decorator.coffe;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark roast";
    }

    @Override
    public double cost() {
        return .99;
    }
}
