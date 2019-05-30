package com.itheima.test10;

/**
 * @author wz
 * @create 2019-01-16 15:51
 */
public class Teacher extends Person {
    public Teacher() {
    }

    public Teacher(int age, String name) {
        super(age, name);
    }

    public void teach() {
        System.out.println("我是一名老师,我在讲课");
    }
}
