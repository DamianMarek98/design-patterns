package com.deny.command.ceilingfan;

public class CeilingFanOffCommand extends CeilingFanCommand {
    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        super(ceilingFan, ceilingFan::off);
    }
}
