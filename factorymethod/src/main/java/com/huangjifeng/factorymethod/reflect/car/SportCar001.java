package com.huangjifeng.factorymethod.reflect.car;

import android.util.Log;

/**
 * Created by Administrator on 2017/6/24.
 */

public class SportCar001 implements ICar001 {
    @Override
    public void run() {
        Log.v("haha", "--跑车- wo run 200 ");
    }
}
