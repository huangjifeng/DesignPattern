package com.huangjifeng.adapter.duck;

import android.util.Log;

/**
 * Created by Administrator on 2017/6/11.
 */

public class GreenHeadDuck implements Duck {
    @Override
    public void quack() {
        Log.v("adapter", "Ga Ga Ga");
    }

    @Override
    public void fly() {
        Log.v("adapter", "I am flying a long distance");
    }
}
