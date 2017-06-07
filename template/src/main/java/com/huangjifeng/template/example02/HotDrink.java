package com.huangjifeng.template.example02;

/**
 * Created by Administrator on 2017/6/7.
 */

public abstract class HotDrink {
    public void drink() {
        boil();
        pour();
        if (isWantEat()) {
            eat();
        }
    }

    //钩子方法
    public boolean isWantEat() {
        return true;
    }

    private void boil() {
    }

    protected abstract void pour();

    public void eat() {
    }
}
