package com.deny.command.ceilingfan;

public class CeilingFanMediumCommand extends CeilingFanCommand {
    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        super(ceilingFan, ceilingFan::medium);
    }
}
