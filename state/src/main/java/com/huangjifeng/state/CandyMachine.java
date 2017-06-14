package com.huangjifeng.state;

import android.util.Log;

import com.huangjifeng.state.state.HasIconState;
import com.huangjifeng.state.state.OnReadyState;
import com.huangjifeng.state.state.SoldOutState;
import com.huangjifeng.state.state.SoldState;
import com.huangjifeng.state.state.State;
import com.huangjifeng.state.state.WinnerState;

/**
 * Created by Administrator on 2017/6/14.
 */

public class CandyMachine implements State {

    public final State hasIconState;
    public final State onReadyState;
    public final State soldOutState;
    public final State soldState;
    public final State winnerState;

    private State state;
    private int count;

    public CandyMachine(int count) {
        hasIconState = new HasIconState(this);
        onReadyState = new OnReadyState(this);
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        this.count = count;
        if (count > 0) {
            state = onReadyState;
        } else {
            state = soldOutState;
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public void insertIcon() {
        state.insertIcon();
    }

    @Override
    public void returnIcon() {
        state.returnIcon();
    }

    @Override
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void releaseCandy() {
        if (count > 0) {
            count = count - 1;
            Log.v("haha", "糖果出来了");
        }else {
            Log.v("haha", "没糖果了");
        }
    }

    public int getCount() {
        return count;
    }

    @Override
    public void dispense() {

    }

    @Override
    public void printstate() {
        Log.v("haha", "---***-------" + state + "-------***---");
    }
}
