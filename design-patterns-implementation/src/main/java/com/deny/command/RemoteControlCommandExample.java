package com.deny.command;

import com.deny.ImplementationExample;
import com.deny.command.garagedoor.GarageDoor;
import com.deny.command.light.Light;
import com.deny.command.stereo.Stereo;

public class RemoteControlCommandExample implements ImplementationExample {
    @Override
    public void start() {
        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light();
        remoteControl.setCommand(0, light::on, light::off);
        GarageDoor garageDoor = new GarageDoor();
        remoteControl.setCommand(1, garageDoor::up, garageDoor::down);
        Stereo stereo = new Stereo();
        remoteControl.setCommand(2, () -> {
            stereo.on();
            stereo.setCD();
            stereo.setVolume(11);
        }, stereo::off);
        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
    }
}
