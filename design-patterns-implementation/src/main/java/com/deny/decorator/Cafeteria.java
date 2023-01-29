package com.deny.decorator;

import com.deny.ImplementationExample;
import com.deny.decorator.coffe.Beverage;
import com.deny.decorator.coffe.DarkRoast;
import com.deny.decorator.coffe.Espresso;
import com.deny.decorator.coffe.HouseBlend;
import com.deny.decorator.condiment.Mocha;
import com.deny.decorator.condiment.Soy;
import com.deny.decorator.condiment.Whip;

public class Cafeteria implements ImplementationExample {
    @Override
    public void start() {
        var beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);
        System.out.println(darkRoast.getDescription() + " $" + darkRoast.cost());

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Soy(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription() + " $" + houseBlend.cost());
    }
}
