package com.huangjifeng.observer;

import java.util.Observable;

/**
 * Created by Administrator on 2017/5/29.
 */

public class WeatherData extends Observable {
    private float mTemperatrue;
    private float mPressure;
    private float mHumidity;

    public float getmTemperatrue() {
        return mTemperatrue;
    }

    public float getmPressure() {
        return mPressure;
    }

    public float getmHumidity() {
        return mHumidity;
    }

    public void setData(float mTemperatrue, float mPressure, float mHumidity) {
        this.mHumidity = mHumidity;
        this.mPressure = mPressure;
        this.mTemperatrue = mTemperatrue;
        dataChange();
    }

    private void dataChange() {
        this.setChanged();
        this.notifyObservers(new Data(getmTemperatrue(), getmPressure(), getmHumidity()));
    }

    class Data {
        private float mTemperatrue;
        private float mPressure;
        private float mHumidity;

        public float getmTemperatrue() {
            return mTemperatrue;
        }

        public float getmPressure() {
            return mPressure;
        }

        public float getmHumidity() {
            return mHumidity;
        }

        public Data(float mTemperatrue, float mPressure, float mHumidity) {
            this.mTemperatrue = mTemperatrue;
            this.mPressure = mPressure;
            this.mHumidity = mHumidity;
        }
    }
}
