package com.huangjifeng.designpattern.flybehavior;

import android.util.Log;

/**
 * Created by Administrator on 2017/5/28.
 */

public class BadFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        Log.v("FlyBehavior", "+++BadFlyBehavior--------");
    }
}
