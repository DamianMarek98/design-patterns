package com.deny.factory.pizzas;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago style deep dish cheese pizza";
        dough = "extra thick crust";
        sauce = "plum tomato";
        toppings.add("Shredded Mozarella Cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cutting into squares");
    }
}
