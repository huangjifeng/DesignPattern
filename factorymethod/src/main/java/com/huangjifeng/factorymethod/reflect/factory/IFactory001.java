package com.huangjifeng.factorymethod.reflect.factory;

import com.huangjifeng.factorymethod.reflect.car.ICar001;

/**
 * Created by Administrator on 2017/6/24.
 */

public interface IFactory001 {
    <T extends ICar001> T createCar(Class<T> clz);
}
