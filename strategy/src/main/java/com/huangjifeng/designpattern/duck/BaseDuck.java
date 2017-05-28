package com.huangjifeng.designpattern.duck;

import android.util.Log;

import com.huangjifeng.designpattern.flybehavior.FlyBehavior;
import com.huangjifeng.designpattern.quackbehavior.QuackBehavior;

/**
 * Created by Administrator on 2017/5/28.
 */

public abstract class BaseDuck {
    protected FlyBehavior mFlyBehavior;
    protected QuackBehavior mQuackBehavior;

    public BaseDuck() {
    }

    public void setmFlyBehavior(FlyBehavior mFlyBehavior) {
        this.mFlyBehavior = mFlyBehavior;
    }

    public void setmQuackBehavior(QuackBehavior mQuackBehavior) {
        this.mQuackBehavior = mQuackBehavior;
    }

    public void fly() {
        mFlyBehavior.fly();
    }

    public void quack() {
        mQuackBehavior.quack();
    }

    public abstract void display();

    public void swim(){
        Log.v("BaseDuck","-----------------------------swim()--");
    }
}
