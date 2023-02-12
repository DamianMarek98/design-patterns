package com.deny.factory.pizzas;

import com.deny.factory.ingredients.PizzaIngredientFactory;

public class CalmPizza extends Pizza {

    final PizzaIngredientFactory pizzaIngredientFactory;

    public CalmPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing" + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
        calms = pizzaIngredientFactory.createCalms();
    }
}
