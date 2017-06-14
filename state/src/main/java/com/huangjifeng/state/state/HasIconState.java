package com.huangjifeng.state.state;

import android.util.Log;

import com.huangjifeng.state.CandyMachine;

import java.util.Random;

/**
 * Created by Administrator on 2017/6/14.
 */

public class HasIconState implements State {
    private final CandyMachine candyMachine;

    public HasIconState(CandyMachine candyMachine) {
        this.candyMachine = candyMachine;
    }

    @Override
    public void insertIcon() {
        Log.v("haha", "你已经塞钱 1 元");
    }

    @Override
    public void returnIcon() {
        Log.v("haha", "还你 1 元");
        candyMachine.setState(candyMachine.onReadyState);
    }

    @Override
    public void turnCrank() {
        Log.v("haha", "恭喜你！有糖果了");
        Random ranwinner = new Random();
        int winner = ranwinner.nextInt(5);
        if (winner == 0){
            candyMachine.setState(candyMachine.winnerState);
        }else {
            candyMachine.setState(candyMachine.soldState);
        }
    }

    @Override
    public void dispense() {

    }

    @Override
    public void printstate() {

    }
}
