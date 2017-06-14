package com.huangjifeng.state.state;

import android.util.Log;

import com.huangjifeng.state.CandyMachine;

/**
 * Created by Administrator on 2017/6/14.
 */

public class SoldOutState implements State {

    private final CandyMachine candyMachine;

    public SoldOutState(CandyMachine candyMachine) {
        this.candyMachine = candyMachine;
    }

    @Override
    public void insertIcon() {
        Log.v("haha", "没糖果了，不要塞钱了");
    }

    @Override
    public void returnIcon() {
        Log.v("haha", "你并没有塞钱，因为压根就没有糖果了");
    }

    @Override
    public void turnCrank() {
        Log.v("haha", "不要摇了，没有糖果");
    }

    @Override
    public void dispense() {

    }

    @Override
    public void printstate() {

    }
}
