package com.huangjifeng.decorator.coffee;

import com.huangjifeng.decorator.Drink;

/**
 * Created by Administrator on 2017/5/30.
 */

public class Coffee extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
