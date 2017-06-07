package com.huangjifeng.iterator.pattern;

/**
 * Created by Administrator on 2017/6/7.
 */

public class Iterator002 implements MyIterator {
    private Student[] students = null;
    private int position = 0;

    public Iterator002(Student[] students) {
        this.students = students;
    }

    @Override
    public boolean hasNext() {
        if (position < students.length) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        Student student = students[position];
        position++;
        return student;
    }
}
