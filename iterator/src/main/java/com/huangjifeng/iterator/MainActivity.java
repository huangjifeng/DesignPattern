package com.huangjifeng.iterator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.huangjifeng.iterator.pattern.Class001;
import com.huangjifeng.iterator.pattern.Class002;
import com.huangjifeng.iterator.pattern.MyIterator;
import com.huangjifeng.iterator.pattern.Student;

import java.util.ArrayList;

/** 迭代器模式
 *
 * 迭代器模式：提供一种方法顺序访问一个容器对象中的各个元素，而又不需要暴露该对象的内部表示
 *
 * */

public class MainActivity extends AppCompatActivity {

    private ArrayList<MyIterator> myIterators = new ArrayList<>();
    private Student student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Class001 class001 = new Class001();
        Class002 class002 = new Class002();
        MyIterator iterator001 = class001.getIterator();
        MyIterator iterator002 = class002.getIterator();
        myIterators.add(iterator001);
        myIterators.add(iterator002);
        for (int i = 0; i < myIterators.size(); i++) {
            while (myIterators.get(i).hasNext()) {
                student = (Student) myIterators.get(i).next();
                if (student.getAge() > 80) {
                    Log.v("haha", student.toString());
                }
            }
        }
    }
}
