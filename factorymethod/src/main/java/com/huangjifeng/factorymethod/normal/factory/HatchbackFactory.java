package com.huangjifeng.factorymethod.normal.factory;

import com.huangjifeng.factorymethod.normal.car.HatchbackCar;
import com.huangjifeng.factorymethod.normal.car.ICar;
import com.huangjifeng.factorymethod.normal.car.JeepCar;

/**
 * Created by Administrator on 2017/6/24.
 */

public class HatchbackFactory implements IFactory {
    @Override
    public ICar createCar() {
        return new HatchbackCar();
    }
}
