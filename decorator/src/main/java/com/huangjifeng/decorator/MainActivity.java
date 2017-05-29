package com.huangjifeng.decorator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.huangjifeng.decorator.coffee.Decaf;
import com.huangjifeng.decorator.coffee.Espresso;
import com.huangjifeng.decorator.coffee.LongBlack;
import com.huangjifeng.decorator.coffee.ShortBlack;
import com.huangjifeng.decorator.decorator.Chocolate;
import com.huangjifeng.decorator.decorator.Milk;
import com.huangjifeng.decorator.decorator.Soy;

import java.io.BufferedReader;

/**
 * 装饰者模式：动态的将新功能附加到对象上，在对象功能扩展方面，它比继承更具有弹性。
 *
 *
 *
 * */

public class MainActivity extends AppCompatActivity {

    private Drink drink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_01:
                drink = new Decaf();
                break;
            case R.id.button_02:
                drink = new Espresso();
                break;
            case R.id.button_03:
                drink = new LongBlack();
                break;
            case R.id.button_04:
                drink = new ShortBlack();
                break;
            case R.id.button_05:
                drink = new Chocolate(drink);
                break;
            case R.id.button_06:
                drink = new Milk(drink);
                break;
            case R.id.button_07:
                drink = new Soy(drink);
                break;
            case R.id.button_08:
                drink.cost();
                Toast.makeText(MainActivity.this, "总金额：" + drink.cost(), Toast.LENGTH_LONG).show();
                Log.v("hahaha", drink.getDescription());
                break;

        }
    }
}
