package com.deny.factory;

import com.deny.factory.pizzas.Pizza;

public abstract class PizzaStore {
    //Factory method pattern
    public abstract Pizza createPizza(String type);
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
