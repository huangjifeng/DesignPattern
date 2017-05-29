package com.huangjifeng.decorator;

/**
 * Created by Administrator on 2017/5/30.
 */

public abstract class Drink {
    protected String description;
    protected float price;

    public String getDescription() {
        return "--description = " + description + "---getPrice=" + getPrice();
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public abstract float cost();


}
