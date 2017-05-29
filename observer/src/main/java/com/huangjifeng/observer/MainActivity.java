package com.huangjifeng.observer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

/**
 * 观察者模式：对象之间多对一依赖的一种设计方案，被依赖的对象为Observable，依赖的对象
 * 为Observer，Observable通知Observer变化。使得每当一个对象改变状态，则所有依赖于它的
 * 对象都会得到通知并自动更新。
 *
 * */

public class MainActivity extends AppCompatActivity {

    private WeatherData mWeatherData;
    private CurrentCondition mCurrentCondition;
    private ForcastCondition mForcastCondition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mWeatherData = new WeatherData();
        mCurrentCondition = new CurrentCondition();
        mForcastCondition = new ForcastCondition();

    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_01:
                mWeatherData.addObserver(mCurrentCondition);
                break;
            case R.id.button_02:
                mWeatherData.addObserver(mForcastCondition);
                break;
            case R.id.button_03:
                mWeatherData.deleteObserver(mForcastCondition);
                break;
            case R.id.button_04:
                mWeatherData.setData(100, 200, 300);
                break;

        }
    }
}
