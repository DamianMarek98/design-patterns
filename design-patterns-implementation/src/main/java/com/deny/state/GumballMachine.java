package com.deny.state;

public class GumballMachine {
    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;

    private State state;

    private int count = 0;

    public GumballMachine(int numberOfGumballs) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        this.count = numberOfGumballs;

        if (numberOfGumballs > 0) {
            state = noQuarterState;
            return;
        }
        state = soldOutState;
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    State getSoldOutState() {
        return soldOutState;
    }

    State getNoQuarterState() {
        return noQuarterState;
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out...");
        count = count - 1;
    }

    State getHasQuarterState() {
        return hasQuarterState;
    }

    State getSoldState() {
        return soldState;
    }

    void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        return count;
    }
}
