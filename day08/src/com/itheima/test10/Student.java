package com.itheima.test10;

/**
 * @author wz
 * @create 2019-01-16 15:51
 */
public class Student extends Person {

    public Student() {

    }

    public Student(int age, String name) {
        super(age, name);
    }

    public void study() {
        System.out.println("我是一名学生,我在学习");
    }
}
