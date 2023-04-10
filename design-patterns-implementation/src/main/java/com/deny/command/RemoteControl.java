package com.deny.command;

import java.util.Arrays;

public class RemoteControl {
    private static final int NUMBER_OF_SLOTS = 7;
    private final Command[] onCommands;
    private final Command[] offCommands;
    private Command undoCommand;


    public RemoteControl() {
        onCommands = new Command[NUMBER_OF_SLOTS];
        offCommands = new Command[NUMBER_OF_SLOTS];

        Command noCommand = new NoCommand();
        for (int i = 0; i < NUMBER_OF_SLOTS; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command on, Command off) {
        if (slot >= NUMBER_OF_SLOTS) {
            throw new NoSuchSlotException(slot);
        }
        onCommands[slot] = on;
        offCommands[slot] = off;
    }

    public void onButtonWasPushed(int slot) {
        if (slot >= NUMBER_OF_SLOTS) {
            throw new NoSuchSlotException(slot);
        }
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void undoButtonWasPushed() {
        if (undoCommand == null) {
            return;
        }
        undoCommand.undo();
    }

    public void offButtonWasPushed(int slot) {
        if (slot >= NUMBER_OF_SLOTS) {
            throw new NoSuchSlotException(slot);
        }
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    @Override
    public String toString() {
        return "RemoteControl{" +
                "onCommands=" + Arrays.toString(onCommands) +
                ", offCommands=" + Arrays.toString(offCommands) +
                ", undoCommand=" + undoCommand +
                '}';
    }
}
