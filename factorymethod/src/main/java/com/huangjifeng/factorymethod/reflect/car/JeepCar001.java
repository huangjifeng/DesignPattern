package com.huangjifeng.factorymethod.reflect.car;

import android.util.Log;

/**
 * Created by Administrator on 2017/6/24.
 */

public class JeepCar001 implements ICar001 {
    @Override
    public void run() {
        Log.v("haha", "---吉普--------- wo run 100 ");
    }
}
