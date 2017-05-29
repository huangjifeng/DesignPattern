package com.huangjifeng.decorator.decorator;

import com.huangjifeng.decorator.Drink;

/**
 * Created by Administrator on 2017/5/30.
 */

public class Milk extends Decorator {
    public Milk(Drink drink) {
        super(drink);
        super.setDescription("## Milk ##");
        super.setPrice(10f);
    }
}
