package com.huangjifeng.observer;

import android.util.Log;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Administrator on 2017/5/29.
 */

public class CurrentCondition implements Observer {
    private float mTemperatrue;
    private float mPressure;
    private float mHumidity;

    @Override
    public void update(Observable o, Object arg) {
        this.mHumidity = ((WeatherData.Data) arg).getmHumidity();
        this.mPressure = ((WeatherData.Data) arg).getmPressure();
        this.mTemperatrue = ((WeatherData.Data) arg).getmTemperatrue();
        display();
    }

    public void display() {
        Log.v("haha", "今天的天气------mHumidity == " + mHumidity);
        Log.v("haha", "今天的天气------mPressure == " + mPressure);
        Log.v("haha", "今天的天气------mTemperatrue == " + mTemperatrue);
    }
}
