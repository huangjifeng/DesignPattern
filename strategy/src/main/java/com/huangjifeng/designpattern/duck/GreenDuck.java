package com.huangjifeng.designpattern.duck;

import com.huangjifeng.designpattern.flybehavior.FlyBehavior;
import com.huangjifeng.designpattern.flybehavior.GoodFlyBehavior;
import com.huangjifeng.designpattern.quackbehavior.NoQuackBehavior;
import com.huangjifeng.designpattern.quackbehavior.QuackBehavior;

/**
 * Created by Administrator on 2017/5/28.
 */

public class GreenDuck extends BaseDuck {

    public GreenDuck() {
        mFlyBehavior = new GoodFlyBehavior();
        mQuackBehavior = new NoQuackBehavior();
    }

    @Override
    public void display() {

    }
}
