package com.huangjifeng.facade.hometheater;

import android.util.Log;

/**
 * Created by Administrator on 2017/6/4.
 */

public class DVDPlayer {
    private static DVDPlayer dvdPlayer = null;

    public static DVDPlayer getInstance() {
        if (dvdPlayer == null) {
            dvdPlayer = new DVDPlayer();
        }
        return dvdPlayer;
    }

    public void on() {
        Log.v("haha", "DVDPlayer is on");
    }

    public void off() {
        Log.v("haha", "DVDPlayer is off");
    }

    public void play() {
        Log.v("haha", "DVDPlayer is play");
    }

    public void pause() {
        Log.v("haha", "DVDPlayer is pause");
    }

    public void setdvd() {
        Log.v("haha", "DVDPlayer is setdvd");
    }


}
