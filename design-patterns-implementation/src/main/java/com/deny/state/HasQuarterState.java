package com.deny.state;

import java.util.Random;

class HasQuarterState implements State {
    private final GumballMachine gumballMachine;
    private final Random winnerRandom = new Random();

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You cant insert another quarter!");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("quarter returned!");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned!");
        int winner = winnerRandom.nextInt(10);
        if (winner == 0 && gumballMachine.getCount() > 1) {
            gumballMachine.setState(gumballMachine.getWinnerState());
            return;
        }

        gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed!");
    }
}
