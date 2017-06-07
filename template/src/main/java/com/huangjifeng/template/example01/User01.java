package com.huangjifeng.template.example01;

/**
 * Created by Administrator on 2017/6/7.
 */

public class User01 extends AbstractClass {
    @Override
    protected void operate02() {
        //抽象函数具体的实现在这里
    }

    @Override
    public void operate03() {
        super.operate03();
        //钩子方法，子类可做自己的操作
    }
}
