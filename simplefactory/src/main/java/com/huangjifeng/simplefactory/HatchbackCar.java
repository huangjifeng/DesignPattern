package com.huangjifeng.simplefactory;

import android.util.Log;

/**
 * Created by Administrator on 2017/6/24.
 */

public class HatchbackCar implements ICar {
    @Override
    public void run() {
        Log.v("haha", "-----两厢车------ wo run 50 ");
    }
}
