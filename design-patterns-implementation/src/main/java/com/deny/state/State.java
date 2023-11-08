package com.deny.state;

interface State {
    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
