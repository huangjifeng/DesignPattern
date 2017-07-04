package com.huangjifeng.singleton.case02;

/**
 * 懒汉式模式                                                  不建议使用
 * 优点：符合用才加载的原则
 * 缺点：是线程不安全的，可能会导致创建两个相同的utils02，所以需要使用synchronized，使用synchronized
 * 导致效率不高，性能较差
 */

public class Utils02 {

    private static Utils02 utils02;

    private Utils02() {
    }

    /**
     * 如下代码，即使Utils2已经被初始化（第一次调用时就会被初始化Utils2），每次调用getInstance（）
     * 方法都会进行同步，这样会消耗不必要的资源，这也是懒汉单例模式存在的最大问题。
     *
     * */
    public static synchronized Utils02 getInstance() {
        if (utils02 == null) {
            utils02 = new Utils02();
        }
        return utils02;
    }
}
