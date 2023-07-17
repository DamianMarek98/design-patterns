package com.deny.templatemethod;

import com.deny.ImplementationExample;

import java.util.Arrays;

public class TemplateMethodExample implements ImplementationExample {
    private static void displayDucks(Duck[] ducks) {
        for (var duck : ducks) {
            System.out.println(duck.toString());
        }
    }

    @Override
    public void start() {
        Tea tea = new Tea();
        tea.prepareRecipe();
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();
        coffeeWithHook.prepareRecipe();

        //sorting (sort as template method)
        Duck[] ducks = {new Duck("A", 8),
                new Duck("B", 2),
                new Duck("B", 7),
                new Duck("C", 2),
                new Duck("D", 10),
                new Duck("E", 2)};
        displayDucks(ducks);
        Arrays.sort(ducks);
        System.out.println("After sort");
        displayDucks(ducks);
    }
}
