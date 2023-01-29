package com.deny.decorator.coffe;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
