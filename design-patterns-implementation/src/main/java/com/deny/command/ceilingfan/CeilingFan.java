package com.deny.command.ceilingfan;

public class CeilingFan {
    static final int HIGH = 3;
    static final int MEDIUM = 2;
    static final int LOW = 1;
    static final int OFF = 0;
    private final String location;
    private int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high() {
        System.out.println("Speed: " + HIGH);
        speed = HIGH;
    }

    public void medium() {
        System.out.println("Speed: " + MEDIUM);
        speed = MEDIUM;
    }

    public void low() {
        System.out.println("Speed: " + LOW);
        speed = LOW;
    }

    public void off() {
        System.out.println("Speed: " + OFF);
        speed = OFF;
    }


    public int getSpeed() {
        return speed;
    }
}
