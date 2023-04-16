package com.deny.facade;

import com.deny.ImplementationExample;

public class HomeTheaterTestDrive implements ImplementationExample {
    @Override
    public void start() {
        var amp = new Amplifier();
        var player = new StreamPlayer();
        var projector = new Projector();
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amp, player, projector);
        homeTheaterFacade.watchMovie();
        homeTheaterFacade.endMovie();
    }
}
