package com.deny.command.ceilingfan;

public class CeilingFanHighCommand extends CeilingFanCommand {

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        super(ceilingFan, ceilingFan::high);
    }
}
