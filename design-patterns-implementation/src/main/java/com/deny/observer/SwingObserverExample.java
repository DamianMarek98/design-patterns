package com.deny.observer;

import javax.swing.*;

public class SwingObserverExample {
    JFrame frame;
    public static void main(String[] args) {
        SwingObserverExample swingObserverExample = new SwingObserverExample();
        swingObserverExample.go();
    }

    private void go() {
        frame = new JFrame();
        JButton button = new JButton("Test!");
        button.addActionListener(event -> System.out.println("First listener (observer)"));
        button.addActionListener(event -> System.out.println("Second listener (observer)"));
    }
}
