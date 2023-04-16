package com.deny.facade;

public class StreamPlayer {
    public void on() {
        System.out.println("Player on");
    }

    public void play() {
        System.out.println("Movie is playing");
    }

    public void stop() {
        System.out.println("Movie is stopped");
    }

    public void off() {
        System.out.println("Stream is off");
    }
}
