package com.huangjifeng.state;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * 状态模式：能根据内部状态的变化，改变对象的行为，看起来好像修改了类
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
