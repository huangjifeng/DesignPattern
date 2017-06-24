package com.huangjifeng.factorymethod.normal.factory;

import com.huangjifeng.factorymethod.normal.car.ICar;
import com.huangjifeng.factorymethod.normal.car.JeepCar;
import com.huangjifeng.factorymethod.normal.car.SportCar;

/**
 * Created by Administrator on 2017/6/24.
 */

public class JeepFactory implements IFactory {
    @Override
    public ICar createCar() {
        return new JeepCar();
    }
}
