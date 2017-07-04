package com.huangjifeng.singleton.case01;

/**
 * 饿汉式模式                                                  不建议使用
 * 优点：多线程安全，直接在加载字节码的时候直接创建
 * 缺点：导致启动慢，违背了用到才去加载的原则
 */

public class Utils01 {

    private Utils01() {
    }

    private static Utils01 utils = new Utils01();

    public static Utils01 getInstance() {
        return utils;
    }
}
