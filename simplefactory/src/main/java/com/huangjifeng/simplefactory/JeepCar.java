package com.huangjifeng.simplefactory;

import android.util.Log;

/**
 * Created by Administrator on 2017/6/24.
 */

public class JeepCar implements ICar {
    @Override
    public void run() {
        Log.v("haha", "---吉普车----- wo run 100 ");
    }
}
