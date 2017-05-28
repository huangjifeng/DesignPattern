package com.huangjifeng.designpattern.flybehavior;

import android.util.Log;

/**
 * Created by Administrator on 2017/5/28.
 */

public class NoFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        Log.v("FlyBehavior", "+++NoFlyBehavior--------");
    }
}
