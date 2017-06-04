package com.huangjifeng.facade.hometheater;

import android.util.Log;

/**
 * Created by Administrator on 2017/6/4.
 */

public class Screen {
    private static Screen screen = null;

    public static Screen getInstance() {
        if (screen == null) {
            screen = new Screen();
        }
        return screen;
    }

    public void down() {
        Log.v("haha", "=------Screen--- is down");
    }

    public void up() {
        Log.v("haha", "=------Screen--- is up");
    }

}
