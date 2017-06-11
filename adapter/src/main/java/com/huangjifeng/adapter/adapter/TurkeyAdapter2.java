package com.huangjifeng.adapter.adapter;

import com.huangjifeng.adapter.turkey.WildTurKey;
import com.huangjifeng.adapter.duck.Duck;

/**
 * 类适配器
 */

public class TurkeyAdapter2 extends WildTurKey implements Duck {

    @Override
    public void quack() {
        super.gobble();
    }

    @Override
    public void fly() {
        super.fly();
        super.fly();
        super.fly();
    }
}
