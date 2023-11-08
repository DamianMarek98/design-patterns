package com.deny.state;

class SoldOutState implements State {
    private final GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Cannot insert no gumballs!");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Haven't inserted coin yet!");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("Turned but there is no gumballs!");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed!");
    }
}
