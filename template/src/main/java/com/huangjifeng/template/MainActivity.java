package com.huangjifeng.template;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.huangjifeng.template.example01.AbstractClass;
import com.huangjifeng.template.example01.User01;
import com.huangjifeng.template.example01.User02;
import com.huangjifeng.template.example02.Coffee;
import com.huangjifeng.template.example02.HotDrink;
import com.huangjifeng.template.example02.Tea;

/**
 * 模板方法模式：定义一个操作中算法的框架，而将一些步骤延迟到子类中。模板方法模式使得子类可以
 * 不改变一个算法的结构即可重定义该算法的某些特定步骤。
 * <p>
 * 在模板方法模式中，可以将相同的代码放在父类中，
 * <p>
 * 模板方法模式的优点：通过使用模板方法模式，一方面提高了代码的复用性，另一方面还可以利用面向对象
 * 的多态性，在运行时选择一种具体子类，实现完整的“请客”方法，提高系统的灵活性和可扩展性。
 * <p>
 * 总结：在模板方法模式中，由于面向对象的多态性，子类对象在运行时将覆盖父类对象，子类中定义的方法
 * 也将覆盖父类中定义的方法，因此程序在运行时，具体子类的基本方法将覆盖父类中定义的基本方法，
 * 子类的钩子方法也将覆盖父类的钩子方法，从而可以通过在子类中实现的钩子方法对父类方法的执行进行约束，
 * 实现子类对父类行为的反向控制。
 *
 *
 * http://blog.csdn.net/lovelion/article/details/8299794
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_01:
                //使用多态，具体实现由子类来做
                AbstractClass user01 = new User01();
                user01.templateMethod();
                AbstractClass user02 = new User02();
                user02.templateMethod();
                break;
            case R.id.button_02:
                HotDrink tea = new Tea();
                HotDrink coffee = new Coffee();
                tea.drink();
                coffee.drink();
                break;
        }
    }
}
