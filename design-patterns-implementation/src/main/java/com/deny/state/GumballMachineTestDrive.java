package com.deny.state;

import com.deny.ImplementationExample;

public class GumballMachineTestDrive implements ImplementationExample {

    @Override
    public void start() {
        var gumballMachine = new GumballMachine("", 5);
        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);
    }
}
