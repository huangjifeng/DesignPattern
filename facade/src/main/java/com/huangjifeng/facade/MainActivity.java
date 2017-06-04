package com.huangjifeng.facade;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.huangjifeng.facade.hometheater.HomeTheaterFacade;

/**
 * 外观模式：提供一个统一的接口，来访问子系统中一群功能相关接口
 * 外观模式定义了一个高层接口，让子系统更容易使用
 *
 *
 * */

public class MainActivity extends AppCompatActivity {

    private HomeTheaterFacade homeTheaterFacade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        homeTheaterFacade = new HomeTheaterFacade();

    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button_01:
                homeTheaterFacade.ready();
                break;
            case R.id.button_02:
                homeTheaterFacade.pause();
                break;
            case R.id.button_03:
                homeTheaterFacade.stop();
                break;
        }
    }
}
