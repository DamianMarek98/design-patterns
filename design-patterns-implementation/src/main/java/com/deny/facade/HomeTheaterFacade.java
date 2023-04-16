package com.deny.facade;

public class HomeTheaterFacade {
    private final Amplifier amp;
    private final StreamPlayer streamPlayer;
    private final Projector projector;

    public HomeTheaterFacade(Amplifier amp, StreamPlayer streamPlayer, Projector projector) {
        this.amp = amp;
        this.streamPlayer = streamPlayer;
        this.projector = projector;
    }

    public void watchMovie() {
        System.out.println("Getting ready to watch movie:");
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setPlayer(streamPlayer);
        amp.setVolume(5);
        streamPlayer.on();
        streamPlayer.play();
    }

    public void endMovie() {
        System.out.println("Ending movie:");
        projector.off();
        amp.off();
        streamPlayer.stop();
        streamPlayer.off();
    }
}
