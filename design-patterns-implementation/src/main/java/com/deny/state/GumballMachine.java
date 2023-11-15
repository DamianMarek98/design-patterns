package com.deny.state;

public class GumballMachine {
    private final State soldOutState;
    private final State noQuarterState;
    private final State hasQuarterState;
    private final State soldState;
    private final State winnerState;
    private String location;

    private State state;

    private int count = 0;

    public GumballMachine(String location, int numberOfGumballs) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        this.count = numberOfGumballs;
        this.location = location;

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

    public State getWinnerState() {
        return winnerState;
    }

    void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        return count;
    }

    public String getLocation() {
        return location;
    }

    public State getState() {
        return state;
    }
}
