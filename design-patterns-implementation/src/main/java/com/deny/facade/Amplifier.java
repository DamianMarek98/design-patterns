package com.deny.facade;

public class Amplifier {
    private StreamPlayer player;
    private int volume = 0;

    public void on() {
        System.out.println("Ampifier on");
    }

    public void setPlayer(StreamPlayer player) {
        this.player = player;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void off() {
        System.out.println("Amplifier off");
    }
}
