package com.huangjifeng.template.example02;

/**
 * Created by Administrator on 2017/6/7.
 */

public class Coffee extends HotDrink {
    @Override
    protected void pour() {
        //抽象方法的具体实现在这里
    }

    @Override
    public boolean isWantEat() {
        return true;
    }

    @Override
    public void eat() {
        super.eat();
        //由于isWantEat()返回的是true，所以子类应该实现该方法来执行具体的操作
    }
}
