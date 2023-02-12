package com.deny.factory;

import com.deny.factory.ingredients.NYPizzaIngredientFactory;
import com.deny.factory.ingredients.PizzaIngredientFactory;
import com.deny.factory.pizzas.*;

public class NYStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
        Pizza pizza;
        return switch (type) {
            case "cheese" -> {
                pizza = new CheesePizza(pizzaIngredientFactory);
                pizza.setName("NY cheese pizza");
                yield pizza;
            }
            case "pepperoni" -> {
                pizza = new PepperoniPizza(pizzaIngredientFactory);
                pizza.setName("NY calms pizza");
                yield pizza;
            }
            case "clam" -> {
                pizza = new CalmPizza(pizzaIngredientFactory);
                pizza.setName("NY calms pizza");
                yield pizza;
            }
            case "veggie" -> {
                pizza = new VeggiePizza(pizzaIngredientFactory);
                pizza.setName("NY veggie pizza");
                yield pizza;
            }
            default -> null;
        };
    }
}
