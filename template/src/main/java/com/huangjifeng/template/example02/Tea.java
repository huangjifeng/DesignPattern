package com.huangjifeng.template.example02;

/**
 * Created by Administrator on 2017/6/7.
 */

public class Tea extends HotDrink {
    @Override
    protected void pour() {
        //抽象方法的具体实现在这里
    }

    @Override
    public boolean isWantEat() {
        return false;
    }
}
