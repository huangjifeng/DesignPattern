package com.huangjifeng.facade.hometheater;

import android.util.Log;

/**
 * Created by Administrator on 2017/6/4.
 */

public class Popcorn {
    private static Popcorn popcorn = null;

    public static Popcorn getInstance() {
        if (popcorn == null) {
            popcorn = new Popcorn();
        }
        return popcorn;
    }


    public void on() {
        Log.v("haha", "Popcorn--- is on");
    }

    public void off() {
        Log.v("haha", "Popcorn--- is off");
    }

    public void pop() {
        Log.v("haha", "Popcorn--- is pop");
    }
}
