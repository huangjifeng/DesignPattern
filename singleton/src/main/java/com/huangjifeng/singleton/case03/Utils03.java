package com.huangjifeng.singleton.case03;

/**
 * DCL单例模式   double check lock                               使用最多的单例模式
 * <p>
 * volatile 关键字：可以保证getInstance（）得到的对象每次都是从主内存中读取，就可以使用DCL的写法来
 * 完成单例模式。当然，volatile或多或少也会影响到性能，但考虑到程序的正确性，牺牲这点性能还是值得的。
 * <p>
 * 优点：能够在需要的时候才初始化单例，又能够保证线程安全，且单例对象初始化后才调用getInatance不进行
 * 同步锁。
 *
 * 缺点：第一次加载时反应稍慢，也由于JAVA内存模型的原因偶尔会失败。在高并发环境下也有一定的缺陷，
 * 虽然发生的概率很小。
 */

public class Utils03 {

    private Utils03() {
    }

    private volatile static Utils03 utils03;

    public static Utils03 getInstance() {
        if (utils03 == null) {
            synchronized (Utils03.class) {
                if (utils03 == null) {
                    utils03 = new Utils03();
                }
            }
        }
        return utils03;
    }


}
