package com.huangjifeng.iterator.pattern;

import java.io.ObjectInput;
import java.util.ArrayList;

/**
 * Created by Administrator on 2017/6/7.
 */

public class Iterator001 implements MyIterator {
    private ArrayList<Student> students = null;
    private int position = 0;

    public Iterator001(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public boolean hasNext() {
        if (position < students.size()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        Student student = students.get(position);
        position++;
        return student;
    }
}
