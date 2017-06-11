package com.huangjifeng.adapter.turkey;

import android.util.Log;

/**
 * Created by Administrator on 2017/6/11.
 */

public class WildTurKey implements Turkey {
    @Override
    public void gobble() {
        Log.v("adapter", "Go Go Go");
    }

    @Override
    public void fly() {
        Log.v("adapter", "I am flying a short distance");
    }
}
