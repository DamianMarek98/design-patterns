package com.deny.proxy;

import com.deny.state.GumballMachine;

public class GumballMachineMonitorTestDrive {
    public static void main(String[] args) {
        int count = 0;
        if (args.length < 2) {
            System.out.println("GumballMachine not enough params");
            return;
        }

        count = Integer.parseInt(args[1]);
        GumballMachine gumballMachine = new GumballMachine(args[0], count);
        GumballMonitor gumballMonitor = new GumballMonitor(gumballMachine);
        gumballMonitor.report();
    }
}
