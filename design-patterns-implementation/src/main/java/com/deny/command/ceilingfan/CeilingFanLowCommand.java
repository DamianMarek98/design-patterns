package com.deny.command.ceilingfan;

public class CeilingFanLowCommand extends CeilingFanCommand {
    public CeilingFanLowCommand(CeilingFan ceilingFan) {
        super(ceilingFan, ceilingFan::low);
    }
}
