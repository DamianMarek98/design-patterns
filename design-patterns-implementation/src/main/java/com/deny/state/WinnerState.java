package com.deny.state;

public class WinnerState implements State {

    private final GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Wait we are giving you a gumball!");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry you already turned the crank!");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn't help!");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
            return;
        }

        gumballMachine.releaseBall();
        System.out.println("You are a winner, you got 2 balls!");
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
            return;
        }

        System.out.println("Out of gumballs!");
        gumballMachine.setState(gumballMachine.getSoldOutState());
    }
}
