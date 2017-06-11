package com.huangjifeng.adapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ListView;

/**
 * 适配器模式：适配器模式把一个类的接口变换成客户端所期待的另一个接口，从而使原本因接口不匹配而无法
 * 在一起工作的两个类能够在一起工作
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
                break;
            case R.id.button_02:
                break;
        }
    }
}
