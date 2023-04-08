package com.deny.command;

import com.deny.ImplementationExample;
import com.deny.command.garagedoor.GarageDoor;
import com.deny.command.garagedoor.GarageDoorOpenCommand;
import com.deny.command.light.Light;
import com.deny.command.light.LightOnCommand;

public class SimpleCommandExample implements ImplementationExample {
    @Override
    public void start() {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);

        simpleRemoteControl.setCommand(lightOn);
        simpleRemoteControl.buttonWasPressed();
        simpleRemoteControl.setCommand(garageDoorOpenCommand);
        simpleRemoteControl.buttonWasPressed();
    }
}
