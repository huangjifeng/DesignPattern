package com.huangjifeng.facade.hometheater;

import android.util.Log;

/**
 * Created by Administrator on 2017/6/4.
 */

public class Stereo {
    private static Stereo stereo;
    private int volume = 6;

    public static Stereo getInstance() {
        if (stereo == null) {
            stereo = new Stereo();
        }
        return stereo;
    }

    public void on() {
        Log.v("haha", "---*******---Stereo--- is on");
    }

    public void off() {
        Log.v("haha", "---*******---Stereo--- is on");
    }

    public void addVolume() {
        if (volume < 11) {
            volume++;
            setVolume(volume);
        }
    }

    public void deleteVolume() {
        if (volume > 0) {
            volume--;
            setVolume(volume);
        }
    }

    private void setVolume(int volume01) {
        volume = volume01;
        Log.v("haha", "---*******---Stereo--- is setVolume = " + volume01);
    }


}
