package com.huangjifeng.decorator.decorator;

import com.huangjifeng.decorator.Drink;

/**
 * Created by Administrator on 2017/5/30.
 */

public class Soy extends Decorator {
    public Soy(Drink drink) {
        super(drink);
        super.setDescription("## Soy ##");
        super.setPrice(20f);
    }
}
