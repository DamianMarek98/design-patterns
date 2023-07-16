package com.deny.templatemethod;

class Coffee extends CaffeineBeverage {

    void brew() {
        System.out.println("brewCofferGrinds");
    }

    void addCondiments() {
        System.out.println("addSugarAndMilk");
    }
}
