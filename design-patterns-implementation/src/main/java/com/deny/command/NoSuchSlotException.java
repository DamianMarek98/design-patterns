package com.deny.command;

public class NoSuchSlotException extends RuntimeException {
    public NoSuchSlotException(int slot) {
        super("Slot with index is not available on this remote " + slot);
    }
}
