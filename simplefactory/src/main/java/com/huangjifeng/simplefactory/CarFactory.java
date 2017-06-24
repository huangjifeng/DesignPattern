package com.huangjifeng.simplefactory;

/**
 * Created by Administrator on 2017/6/24.
 */

public class CarFactory {

    public static ICar createCar(int type) {
        switch (type) {
            case MainActivity.SPORT_CAR:
                return new SportCar();
            case MainActivity.JEEP_CAR:
                return new JeepCar();
            case MainActivity.HATCH_BACK_CAR:
                return new HatchbackCar();
        }
        return new SportCar();
    }

    /**
     * 通过反射来做简单工厂模式，代码更少但是效率会低一点
     *
     * @param clz
     * @param <T>
     * @return
     */
    public <T extends ICar> T createCar(Class<T> clz) {
        ICar car = null;
        try {
            car = (ICar) Class.forName(clz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) car;
    }
}
