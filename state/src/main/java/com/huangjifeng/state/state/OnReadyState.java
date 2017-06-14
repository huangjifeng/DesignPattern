package com.huangjifeng.state.state;

import android.util.Log;

import com.huangjifeng.state.CandyMachine;

/**
 * Created by Administrator on 2017/6/14.
 */

public class OnReadyState implements State {

    private final CandyMachine candyMachine;

    public OnReadyState(CandyMachine candyMachine) {
        this.candyMachine = candyMachine;
    }

    @Override
    public void insertIcon() {
        Log.v("haha", "塞钱 -- 成功");
        candyMachine.setState(candyMachine.hasIconState);
    }

    @Override
    public void returnIcon() {
        Log.v("haha", "你并没有塞钱，所以没法退钱");
    }

    @Override
    public void turnCrank() {
        Log.v("haha", "你并没有塞钱，所以不能摇下糖果");
    }

    @Override
    public void dispense() {

    }

    @Override
    public void printstate() {

    }
}
