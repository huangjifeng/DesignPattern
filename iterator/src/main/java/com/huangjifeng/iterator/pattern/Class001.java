package com.huangjifeng.iterator.pattern;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/6/7.
 */

public class Class001 {
    private ArrayList<Student> students = null;

    public Class001() {
        students = new ArrayList<>();
        addStudent("小红", 40, 50);
        addStudent("小小红", 40, 50);
        addStudent("小小小红", 40, 50);
        addStudent("小小小小红", 40, 50);
        addStudent("小小小小小红", 40, 50);
    }

    public void addStudent(String name, int age, float height) {
        Student student = new Student(name, age, height);
        students.add(student);
    }

    public MyIterator getIterator() {
        return new Iterator001(students);
    }
}
