package com.huangjifeng.designpattern.duck;

import com.huangjifeng.designpattern.flybehavior.FlyBehavior;
import com.huangjifeng.designpattern.flybehavior.GoodFlyBehavior;
import com.huangjifeng.designpattern.flybehavior.NoFlyBehavior;
import com.huangjifeng.designpattern.quackbehavior.HahaQuackBehavior;
import com.huangjifeng.designpattern.quackbehavior.NoQuackBehavior;
import com.huangjifeng.designpattern.quackbehavior.QuackBehavior;

/**
 * Created by Administrator on 2017/5/28.
 */

public class RedDuck extends BaseDuck {

    public RedDuck() {
        mFlyBehavior = new NoFlyBehavior();
        mQuackBehavior = new HahaQuackBehavior();
    }

    @Override
    public void display() {

    }
}
