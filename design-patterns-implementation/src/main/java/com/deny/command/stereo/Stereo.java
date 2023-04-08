package com.deny.command.stereo;

public class Stereo {
    private Mode mode = Mode.DVD;
    private int volume = 5;

    public void on() {
        System.out.println("Stereo is playing");
    }

    public void off() {
        System.out.println("Stereo is off");
    }

    public void setDVD() {
        this.mode = Mode.DVD;
        printModeInformation();
    }

    public void setCD() {
        this.mode = Mode.CD;
        printModeInformation();
    }

    public void setRadio() {
        this.mode = Mode.RADIO;
        printModeInformation();
    }

    private void printModeInformation() {
        System.out.println(mode.name() + " mode is set");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Volume is now " + volume);
    }

    private enum Mode {
        CD,
        DVD,
        RADIO
    }
}
