package com.huangjifeng.factorymethod.reflect.factory;

import com.huangjifeng.factorymethod.reflect.car.ICar001;

/**
 * Created by Administrator on 2017/6/24.
 */

public class ConcreteFactory implements IFactory001 {


    @Override
    public <T extends ICar001> T createCar(Class<T> clz) {
        ICar001 car001 = null;
        try {
            car001 = (ICar001) Class.forName(clz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) car001;
    }
}
