package app;

public class Facade {
    // define properties for each component
    private Amplifier amplifier;
    private CdPlayer cdPlayer;
    private DvdPlayer dvd;
    private PopcornPopper popcornPopper;
    private Projector projector;
    private Screen screen;
    private TheaterLights theaterLights;
    private Tuner tuner;

    // constructor - takes in each component
    public Facade(
            Amplifier amplifier,
            CdPlayer cdPlayer,
            DvdPlayer dvd,
            PopcornPopper popcornPopper,
            Projector projector,
            Screen screen,
            TheaterLights theaterLights,
            Tuner tuner) {
        // assign each component to the property
        this.amplifier = amplifier;
        this.cdPlayer = cdPlayer;
        this.dvd = dvd;
        this.popcornPopper = popcornPopper;
        this.projector = projector;
        this.screen = screen;
        this.theaterLights = theaterLights;
        this.tuner = tuner;
    }

    // define a method for each action

    // to watch a movie
    public void toWatchAMovie(){
        // turn popcorn popper on.
        popcornPopper.on();
        // let the popcorn popper pop.
        popcornPopper.pop();
        // Dim the lights
        theaterLights.dim(10);
        // Put the screen down
        screen.down();
        // Put the projector on
        projector.on();
        // and set it to wide screen mode
        projector.wideScreenMode();
        // Put the amplifier on
        amplifier.on();
        // insert an DVD in it
        amplifier.setDvd(dvd);
        // enable surround sound on
        amplifier.setSurroundSound();
        // set the volume to 5
        amplifier.setVolume(5);
        // set the dvdplayer on
        dvd.on();
        // play the movie on the dvd player
        dvd.play("Bad neighbors");
    }

    // When we're ready watching the movie
    public void finishedMovie () {
        // turn the popcorn popper off
        popcornPopper.off();
        // put the lights on
        theaterLights.on();
        // roll up the screen
        screen.up();
        // turn off the projector
        projector.off();
        // turn off the amplifier
        amplifier.off();
        // stop the dvd
        dvd.stop();
        // eject dvd
        dvd.eject();
        // turn off dvd player
        dvd.off();
    }

    // to listen to music
    public void toListenToMusic(){
        // put the lights on
        theaterLights.on();
        // put the amplifier on
        amplifier.on();
        // set the volume of the amplifier to 5
        amplifier.setVolume(5);
        // insert a cd in the amplifier
        amplifier.setCd(cdPlayer);
        // and enable sterio sound
        amplifier.setStereoSound();
        // turn the cd player on
        cdPlayer.on();
        // let the player play the cd
        cdPlayer.play("Rewind 2022");
    }

    // When we're ready listening music
    public void finishedMusic () {
        // turn the amplifier off
        amplifier.off();
        // set the amplifier to cd mode
        amplifier.setCd(cdPlayer);
        // eject cd out of the cd player
        cdPlayer.eject();
        // turn off cd player
        cdPlayer.off();
    }

    // To listen to the radio we should
    public void listenToRadio(){
        // turn the tuner on
        tuner.off();
        // set the frequence to the required number
        tuner.setFrequency(101.1);
        // turn the amplifier on
        amplifier.on();
        // set the amplifier volume to 5
        amplifier.setVolume(5);
        // set the amplifier to tuner mode
        amplifier.setTuner(tuner);
    }

    // When we're ready listening music
    public void finishedRadio(){
        // turn of the tuner
        tuner.off();
        // turn off the amplifier
        amplifier.off();
    }

}

