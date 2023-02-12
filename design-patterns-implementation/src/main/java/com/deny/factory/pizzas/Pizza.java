package com.deny.factory.pizzas;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();

    public void prepare() {
        StringBuilder sb = new StringBuilder();
        sb.append("Preparing ")
                .append(name).append(System.lineSeparator())
                .append("Tossing dough...").append(System.lineSeparator())
                .append("Adding sauce..").append(System.lineSeparator())
                .append("Adding toppings: ").append(System.lineSeparator());
        toppings.forEach(topping -> sb.append("   ").append(topping).append(System.lineSeparator()));
        System.out.println(sb);
    }

    public void bake() {
        System.out.println("bake for 25 min at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Packing pizza");
    }

    public String getName() {
        return name;
    }
}
