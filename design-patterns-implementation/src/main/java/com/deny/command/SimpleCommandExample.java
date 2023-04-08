package com.deny.command;

import com.deny.ImplementationExample;
import com.deny.command.light.Light;
import com.deny.command.light.LightOnCommand;

public class SimpleCommandExample implements ImplementationExample {
    @Override
    public void start() {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);

        simpleRemoteControl.setCommand(lightOn);
        simpleRemoteControl.buttonWasPressed();
    }
}
