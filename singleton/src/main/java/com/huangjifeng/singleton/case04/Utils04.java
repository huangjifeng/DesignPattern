package com.huangjifeng.singleton.case04;

/**
 * 静态内部类单例模式                                              最推荐使用
 *
 * 当第一次加载Utils04类时并不会初始化Utils04，只有在第一次调用Utils04的getInstance（）方法时才会
 * 导致utils04的初始化。因此，第一次调用getInstance（）方法会导致虚拟机加载Utils04Holder类。
 * 这种方式不仅能确保线程安全，也能够保证单例对象的唯一性，同时也延迟了单例的实例化，所以这是推荐
 * 使用的单例模式实现方式。
 */

public class Utils04 {
    private Utils04() {
    }

    public static Utils04 getInstance() {
        return Utils04Holder.utils04;
    }

    /** 静态内部类 */
    private static class Utils04Holder {
        private static final Utils04 utils04 = new Utils04();
    }

}
