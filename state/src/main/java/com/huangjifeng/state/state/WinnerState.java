package com.huangjifeng.state.state;

import android.util.Log;

import com.huangjifeng.state.CandyMachine;

/**
 * Created by Administrator on 2017/6/14.
 */

public class WinnerState implements State {

    private final CandyMachine candyMachine;

    public WinnerState(CandyMachine candyMachine) {
        this.candyMachine = candyMachine;
    }

    @Override
    public void insertIcon() {

    }

    @Override
    public void returnIcon() {

    }

    @Override
    public void turnCrank() {

    }

    @Override
    public void dispense() {
        candyMachine.releaseCandy();
        if (candyMachine.getCount() == 0) {
            candyMachine.setState(candyMachine.soldOutState);
        } else {
            Log.v("haha", "你真幸运，得大奖了");
            candyMachine.releaseCandy();
            if (candyMachine.getCount() > 0) {
                candyMachine.setState(candyMachine.onReadyState);
            } else {
                candyMachine.setState(candyMachine.soldOutState);
            }
        }

    }

    @Override
    public void printstate() {

    }
}
