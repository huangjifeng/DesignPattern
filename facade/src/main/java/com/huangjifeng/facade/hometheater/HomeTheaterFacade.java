package com.huangjifeng.facade.hometheater;

/**
 * Created by Administrator on 2017/6/4.
 */

public class HomeTheaterFacade {

    private final DVDPlayer dvdPlayer;
    private final Popcorn popcorn;
    private final Stereo stereo;
    private final Screen screen;

    public HomeTheaterFacade() {
        dvdPlayer = new DVDPlayer();
        popcorn = new Popcorn();
        stereo = new Stereo();
        screen = new Screen();
    }

    public void ready(){
        dvdPlayer.on();
        dvdPlayer.play();
        popcorn.on();
        popcorn.pop();
        screen.down();
        stereo.addVolume();
        stereo.on();
    }

    public void pause(){
        dvdPlayer.pause();
    }

    public void stop(){
        dvdPlayer.off();
        popcorn.off();
        screen.up();
        stereo.deleteVolume();
        stereo.deleteVolume();
        stereo.deleteVolume();
        stereo.off();
    }
}
