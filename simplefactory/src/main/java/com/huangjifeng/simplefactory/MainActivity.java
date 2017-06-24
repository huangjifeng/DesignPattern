package com.huangjifeng.simplefactory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * 简单工厂模式：属于创建型模式，又叫静态工厂方法模式。
 * 简单工厂模式是由一个工厂对象决定创建出哪一种产品类的实例，简单工厂模式是工厂模式家族中最简单使用
 * 的模式，可以理解是不同工厂模式的一种特殊实现
 *
 * 优点：简单工厂模式能够根据外界给定的信息，决定究竟应该创建哪个具体类的对象，明确区分了各自的职责
 * 和权力，有利于整个软件体系结构的优化
 *
 * 缺点：很明显工厂类集中了所有实例的逻辑，容易违反高内聚的责任分配原则
 */

public class MainActivity extends AppCompatActivity {
    public static final int SPORT_CAR = 0;
    public static final int JEEP_CAR = 1;
    public static final int HATCH_BACK_CAR = 2;
    private ICar car;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button01:
                car = CarFactory.createCar(SPORT_CAR);
                break;
            case R.id.button02:
                car = CarFactory.createCar(JEEP_CAR);
                break;
            case R.id.button03:
                car = CarFactory.createCar(HATCH_BACK_CAR);
                break;
            case R.id.button04:
                car.run();
                break;
        }
    }
}
