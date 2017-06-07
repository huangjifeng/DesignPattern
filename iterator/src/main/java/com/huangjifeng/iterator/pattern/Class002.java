package com.huangjifeng.iterator.pattern;

/**
 * Created by Administrator on 2017/6/7.
 */

public class Class002 {
    private static int MAX_ITEM = 5;
    private Student[] students = null;

    public Class002() {
        students = new Student[MAX_ITEM];
        students[0] = new Student("大明", 100, 200);
        students[1] = new Student("大大明", 100, 200);
        students[2] = new Student("大大大明", 100, 200);
        students[3] = new Student("大大大大明", 100, 200);
    }


    public MyIterator getIterator() {
        return new Iterator002(students);
    }
}
