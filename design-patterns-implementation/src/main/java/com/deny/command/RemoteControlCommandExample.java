package com.deny.command;

import com.deny.ImplementationExample;
import com.deny.command.ceilingfan.*;
import com.deny.command.garagedoor.GarageDoor;
import com.deny.command.garagedoor.GarageDoorCloseCommand;
import com.deny.command.garagedoor.GarageDoorOpenCommand;
import com.deny.command.light.Light;
import com.deny.command.light.LightOffCommand;
import com.deny.command.light.LightOnCommand;
import com.deny.command.macro.MacroCommand;
import com.deny.command.stereo.Stereo;
import com.deny.command.stereo.StereoOffCommand;
import com.deny.command.stereo.StereoOnWithCDCommand;

public class RemoteControlCommandExample implements ImplementationExample {
    @Override
    public void start() {
        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);
        remoteControl.setCommand(1, garageDoorOpenCommand, garageDoorCloseCommand);
        Stereo stereo = new Stereo();
        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
        remoteControl.setCommand(2, stereoOnWithCDCommand, stereoOffCommand);

        //ceiling fan with state
        CeilingFan ceilingFan = new CeilingFan("Test");
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanLowCommand ceilingFanLowCommand = new CeilingFanLowCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
        remoteControl.setCommand(3, ceilingFanHighCommand, ceilingFanOffCommand);
        remoteControl.setCommand(4, ceilingFanMediumCommand, ceilingFanOffCommand);
        remoteControl.setCommand(5, ceilingFanLowCommand, ceilingFanOffCommand);

        MacroCommand partyModeOn = new MacroCommand(new Command[]{ceilingFanHighCommand, stereoOnWithCDCommand, lightOnCommand});
        MacroCommand partyModeOff = new MacroCommand(new Command[]{ceilingFanLowCommand, stereoOffCommand, lightOffCommand});
        remoteControl.setCommand(6, partyModeOn, partyModeOff);
        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(4);
        remoteControl.offButtonWasPushed(4);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(5);
        remoteControl.undoButtonWasPushed();

        //party mode on/undo/off/undo
        remoteControl.onButtonWasPushed(6);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(6);
        remoteControl.undoButtonWasPushed();
    }
}
