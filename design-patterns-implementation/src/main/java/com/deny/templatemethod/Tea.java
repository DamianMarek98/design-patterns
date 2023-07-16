package com.deny.templatemethod;

class Tea extends CaffeineBeverage {
    void brew() {
        System.out.println("steepTeaBag");
    }

    void addCondiments() {
        System.out.println("addLemon");
    }
}
