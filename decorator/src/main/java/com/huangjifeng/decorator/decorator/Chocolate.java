package com.huangjifeng.decorator.decorator;

import com.huangjifeng.decorator.Drink;

/**
 * Created by Administrator on 2017/5/30.
 */

public class Chocolate extends Decorator {
    public Chocolate(Drink drink) {
        super(drink);
        super.setDescription("## Chocolate ##");
        super.setPrice(30f);
    }
}
