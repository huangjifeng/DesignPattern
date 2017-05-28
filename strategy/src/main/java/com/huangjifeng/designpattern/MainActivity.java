package com.huangjifeng.designpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.huangjifeng.designpattern.duck.BaseDuck;
import com.huangjifeng.designpattern.duck.GreenDuck;
import com.huangjifeng.designpattern.duck.RedDuck;
import com.huangjifeng.designpattern.flybehavior.BadFlyBehavior;
import com.huangjifeng.designpattern.flybehavior.GoodFlyBehavior;
import com.huangjifeng.designpattern.quackbehavior.GagaQuackBehavior;
import com.huangjifeng.designpattern.quackbehavior.HahaQuackBehavior;

/**
 * 1、继承的问题：对类的局部改动，尤其父类的局部改动，会影响其他部分，影响会有溢出的效应
 * 父类挖的一个坑，每个子类都要来填，增加工作量，不是好的设计方式
 * 2、需要新的设计方式，应对项目的扩展，降低复杂度
 * 1）分析项目变化和不变的部分，提取变化部分，抽象成接口 +  实现
 * 2）鸭子哪些功能是会根据新需求变化的？叫声、飞行。。。
 * <p>
 * 策略模式的优点：
 * 新增行为简单，行为类更好的复用，组合更方便。即有继承带来的复用性的好处也没有挖坑
 * 多用组合少用继承；用行为类组合，而不是行为的继承。更有弹性
 * <p>
 * 策略模式：分别封装行为接口，实现算法族，父类里放行为接口对象，在子类里具体设定行为对象，
 * 原则就是：分离变化部分，封装接口，基于接口编程各种功能。此模式让行为算法的变化独立
 * 于算法的使用者。
 * <p>
 * <p>
 * 策略模式的定义：策略模式定义了一系列的算法，并将每一个算法封装起来，而且是它们还可以相
 * 互替换，策略模式让算法独立于使用它的客户而独立变化。
 * <p>
 * 使用场景：
 * 1、针对同一类型问题的多种处理方式，仅仅是具体行为有差别时
 * 2、需要安全地封装多种同一类型的操作时。
 * 3、出现同一抽象类有多个子类，而又需要使用if-else或者switch-case来选择具体子类时。
 */
public class MainActivity extends AppCompatActivity {

    private BaseDuck mGreenDuck;
    private BaseDuck mRenDuck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mGreenDuck = new GreenDuck();
        mRenDuck = new RedDuck();
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_01:
                Log.v("MainActivity", "********8=  绿鸭子 ");
                mGreenDuck.fly();
                mGreenDuck.quack();
                break;
            case R.id.button_02:
                Log.v("MainActivity", "********8=             红鸭子 ");
                mRenDuck.fly();
                mRenDuck.quack();
                break;
            case R.id.button_03:
                Log.v("MainActivity", "********8=  绿鸭子   变了");
                mGreenDuck.setmQuackBehavior(new HahaQuackBehavior());
                mGreenDuck.setmFlyBehavior(new BadFlyBehavior());
                mGreenDuck.fly();
                mGreenDuck.quack();
                break;
            case R.id.button_04:
                Log.v("MainActivity", "********8=             红鸭子   变了");
                mRenDuck.setmQuackBehavior(new GagaQuackBehavior());
                mRenDuck.setmFlyBehavior(new GoodFlyBehavior());
                mRenDuck.fly();
                mRenDuck.quack();
                break;

        }
    }
}
