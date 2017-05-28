package com.huangjifeng.designpattern.quackbehavior;

import android.util.Log;

/**
 * Created by Administrator on 2017/5/28.
 */

public class NoQuackBehavior implements QuackBehavior {
    @Override
    public void quack() {
        Log.v("QuackBehavior","----------NoQuackBehavior--");
    }
}
