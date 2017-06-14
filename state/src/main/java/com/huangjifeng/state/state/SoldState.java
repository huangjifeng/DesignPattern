package com.huangjifeng.state.state;

import android.util.Log;

import com.huangjifeng.state.CandyMachine;

/**
 * Created by Administrator on 2017/6/14.
 */

public class SoldState implements State {

    private final CandyMachine candyMachine;

    public SoldState(CandyMachine candyMachine) {
        this.candyMachine = candyMachine;
    }

    @Override
    public void insertIcon() {
        Log.v("haha", "请稍等，我们正在给你糖果");
    }

    @Override
    public void returnIcon() {
        Log.v("haha", "你已经答应买糖果了，我们不能退还给你");
    }

    @Override
    public void turnCrank() {
        Log.v("haha", "正在出糖果，別摇了");
    }

    @Override
    public void dispense() {
        candyMachine.releaseCandy();
        if (candyMachine.getCount() > 0) {
            candyMachine.setState(candyMachine.onReadyState);
        } else {
            candyMachine.setState(candyMachine.soldOutState);
        }

    }

    @Override
    public void printstate() {

    }
}
