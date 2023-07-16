package com.deny.templatemethod;

import java.util.Random;

public class CoffeeWithHook extends CaffeineBeverage {

    private final Random randomInt = new Random();

    void brew() {
        System.out.println("Dripping Coffee");
    }

    void addCondiments() {
        System.out.println("add sugar and milk");
    }

    @Override
    boolean customerWantsCondiments() {
        String answer = getUserInput();
        return answer.toLowerCase().startsWith("y");
    }

    private String getUserInput() {
        return randomInt.nextInt() % 2 == 0 ? "yes" : "no";
    }
}
