package com.huangjifeng.simplefactory;

import android.util.Log;

/**
 * Created by Administrator on 2017/6/24.
 */

public class SportCar implements ICar {
    @Override
    public void run() {
        Log.v("haha", "--跑车- wo run 200 ");
    }
}
