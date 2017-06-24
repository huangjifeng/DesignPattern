package com.huangjifeng.factorymethod;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import com.huangjifeng.factorymethod.normal.car.ICar;
import com.huangjifeng.factorymethod.normal.car.SportCar;
import com.huangjifeng.factorymethod.normal.factory.HatchbackFactory;
import com.huangjifeng.factorymethod.normal.factory.IFactory;
import com.huangjifeng.factorymethod.normal.factory.JeepFactory;
import com.huangjifeng.factorymethod.normal.factory.SportFactory;
import com.huangjifeng.factorymethod.reflect.car.HatchbackCar001;
import com.huangjifeng.factorymethod.reflect.car.ICar001;
import com.huangjifeng.factorymethod.reflect.car.JeepCar001;
import com.huangjifeng.factorymethod.reflect.car.SportCar001;
import com.huangjifeng.factorymethod.reflect.factory.ConcreteFactory;
import com.huangjifeng.factorymethod.reflect.factory.IFactory001;

/**
 * 工厂方法模式  factory method          又称多态性工厂模式
 * 在工厂方法模式中，核心的工厂类不再负责所有产品的创建，而是将具体创建的工作交给子类去做。给核心类
 * 成为一个抽象工厂角色，仅负责给出具体工厂子类必须实现的接口而不接触哪一个产品类应当被实例化这种细节。
 * <p>
 * 定义：工厂方法模式是简单工厂模式的衍生，解决了许多简单工厂模式的问题。首先完全实现 开--闭原则  ，
 * 实现了可扩展。其次更复杂的层次结构，可以应用于产品结果复杂的场合
 *
 *
 * 优点：
 * 1、子类提供挂钩。基类为工厂方法提供缺省实现，子类可以重写新的实现，也可以继承父类实现
 *      加一层间接性，增加了灵活性
 * 2、屏蔽产品类。产品类的实现如何变化，调用者都不需要关心，只需要关心产品的接口，只要接口
 *      保持不变，系统中的上层模块就不会发生变化
 * 3、典型的解耦框架，高层模块只需要知道产品的抽象类，其他的实现类都不需要关心，符合迪米特法则，
 *       符合依赖倒置原则，符合里氏替换原则。
 * 4、多态性。客户代表可以做到与特定应用无关，适用于任何实体类
 * 缺点：需要Creator和相应的子类作为factory method的载体，如果应用模型确实需要creator和子类存在，
 * 则很好；否则的话，需要增加一个类层次。(不过说这个缺点好像有点吹毛求疵了)
 */

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private IFactory factory;
    private ICar car;
    private ICar001 car001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.edit_text);
    }

    public void onClick(View view) {
        int num = -1;
        if (!editText.getText().toString().equals("")) {
            num = Integer.parseInt(editText.getText().toString());
        }
        switch (view.getId()) {
            case R.id.button_01:
                if (num == 0) {
                    factory = new SportFactory();
                } else if (num == 1) {
                    factory = new JeepFactory();
                } else if (num == 2) {
                    factory = new HatchbackFactory();
                } else {
                    return;
                }
                car = factory.createCar();
                car.run();
                break;
            case R.id.button_02:
                //利用反射的方式更简洁地来生成具体产品对象，此时，需要在工厂方法的参数列表中传入
                // 一个Class类来决定是哪一个产品类
                IFactory001 factory001 = new ConcreteFactory();
                if (num == 0) {
                    car001 = factory001.createCar(SportCar001.class);
                } else if (num == 1) {
                    car001 = factory001.createCar(JeepCar001.class);
                } else if (num == 2) {
                    car001 = factory001.createCar(HatchbackCar001.class);
                } else {
                    return;
                }
                car001.run();
                break;
        }

    }
}
