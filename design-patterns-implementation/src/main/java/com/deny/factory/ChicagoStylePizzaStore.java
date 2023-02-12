package com.deny.factory;

import com.deny.factory.ingredients.ChicagoPizzaIngredientFactory;
import com.deny.factory.ingredients.PizzaIngredientFactory;
import com.deny.factory.pizzas.*;

public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        PizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();
        Pizza pizza;

        return switch (type) {
            case "cheese" -> {
                pizza = new CheesePizza(pizzaIngredientFactory);
                pizza.setName("Chicago cheese pizza");
                yield pizza;
            }
            case "pepperoni" -> {
                pizza = new PepperoniPizza(pizzaIngredientFactory);
                pizza.setName("Chicago calms pizza");
                yield pizza;
            }
            case "clam" -> {
                pizza = new CalmPizza(pizzaIngredientFactory);
                pizza.setName("Chicago calms pizza");
                yield pizza;
            }
            case "veggie" -> {
                pizza = new VeggiePizza(pizzaIngredientFactory);
                pizza.setName("Chicago veggie pizza");
                yield pizza;
            }
            default -> null;
        };
    }
}
