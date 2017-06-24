package com.huangjifeng.state;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * 状态模式：能根据内部状态的变化，改变对象的行为，看起来好像修改了类
 *
 * 状态模式中的行为是由状态来决定的，不同的状态下有不同的行为，状态模式和策略模式的结构几乎完全一样，
 * 但它们的目的、本质却完全不一样，状态模式的行为是平行的，不可替换的，策略模式的行为是彼此独立，
 * 可互相替换的。用一句话来表述，状态模式把对象的行为包装在不同的状态对象里，每一个状态对象都有一个
 * 共同的抽象状态类。状态模式的意图是让一个对象在其内部状态改变的时候，其行为也随之改变。
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CandyMachine candyMachine = new CandyMachine(6);
        candyMachine.printstate();
        candyMachine.insertIcon();
        candyMachine.printstate();
        candyMachine.returnIcon();
        candyMachine.printstate();

        for (int i = 0; i < 3; i++) {
            candyMachine.insertIcon();
            candyMachine.printstate();
            candyMachine.turnCrank();
            candyMachine.printstate();
        }

    }
}
