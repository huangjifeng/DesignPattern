package com.huangjifeng.adapter.adapter;

import com.huangjifeng.adapter.duck.Duck;
import com.huangjifeng.adapter.turkey.Turkey;

/**
 * Created by Administrator on 2017/6/11.
 */

public class TurkeyAdapter implements Duck {

    private final Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 6; i++) {
            turkey.fly();
        }
    }
}
