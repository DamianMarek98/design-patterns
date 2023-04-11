package com.deny.adapter;

import com.deny.ImplementationExample;

public class DuckTestDrive implements ImplementationExample {

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();

    }

    @Override
    public void start() {
        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        System.out.println("Turkey:");
        turkey.gobble();
        turkey.fly();

        System.out.println("Duck:");
        testDuck(duck);

        System.out.println("Turkey adapter to duck:");
        testDuck(turkeyAdapter);
    }
}
