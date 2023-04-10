package com.deny.command.ceilingfan;

import com.deny.command.Command;

public abstract class CeilingFanCommand implements Command {
    final CeilingFan ceilingFan;
    private final Runnable setModeFunction;
    int prevSpeed;


    CeilingFanCommand(CeilingFan ceilingFan, Runnable setModeFunction) {
        this.ceilingFan = ceilingFan;
        this.setModeFunction = setModeFunction;
    }

    @Override
    public final void execute() {
        prevSpeed = ceilingFan.getSpeed();
        setModeFunction.run();
    }

    @Override
    public final void undo() {
        switch (prevSpeed) {
            case CeilingFan.HIGH -> ceilingFan.high();
            case CeilingFan.MEDIUM -> ceilingFan.medium();
            case CeilingFan.LOW -> ceilingFan.low();
            default -> ceilingFan.off();
        }
    }
}
