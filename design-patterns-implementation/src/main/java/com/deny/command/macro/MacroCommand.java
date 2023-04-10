package com.deny.command.macro;

import com.deny.command.Command;

public class MacroCommand implements Command {
    private final Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (var command : commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        for (var command : commands) {
            command.undo();
        }
    }
}
