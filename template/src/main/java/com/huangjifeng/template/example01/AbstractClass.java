package com.huangjifeng.template.example01;

/**
 * 钩子方法：可以有两种实现形式
 *      1、第一类钩子方法可以与一些具体步骤“挂钩”，以实现在不同条件下执行模板方法中的不同步骤，
 *      这类钩子方法的返回类型通常是bool类型的，这类方法名一般为IsXXX()，用于对某个条件进行判断，
 *      如果条件满足则执行某一步骤，否则将不执行
 *      2、还有一类钩子方法就是实现体为空的具体方法，子类可以根据需要覆盖或者继承这些钩子方法，
 *      与抽象方法相比，这类钩子方法的好处在于子类如果没有覆盖父类中定义的钩子方法，编译可以正常通过，
 *      但是如果没有覆盖父类中声明的抽象方法，编译将报错。
 */

public abstract class AbstractClass {

    //定义了算法的框架，
    public void templateMethod(){
        operate01();
        operate02();
        operate03();
    }

    private void operate01() {
        //实现代码
    }

    //子类必须继承
    protected abstract void operate02();

    //空函数，子类可自行选择实现，这是其中一种钩子方法
    public void operate03() {
    }


}
