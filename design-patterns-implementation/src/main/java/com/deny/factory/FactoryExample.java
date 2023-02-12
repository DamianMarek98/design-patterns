package com.deny.factory;

import com.deny.ImplementationExample;
import com.deny.factory.pizzas.Pizza;

public class FactoryExample implements ImplementationExample {
    @Override
    public void start() {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + System.lineSeparator());

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + System.lineSeparator());
    }
}
