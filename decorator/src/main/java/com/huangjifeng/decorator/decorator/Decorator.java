package com.huangjifeng.decorator.decorator;

import com.huangjifeng.decorator.Drink;

/**
 * Created by Administrator on 2017/5/30.
 */

public class Decorator extends Drink {
    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDescription() {
        return "getDescription = " + super.getDescription() + " - -getPrice= " + super.getPrice()
                + " &&&& " + drink.getDescription();
    }
}
