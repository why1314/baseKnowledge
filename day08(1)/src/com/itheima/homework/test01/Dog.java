package com.itheima.homework.test01;

/**
 * @author wz
 * @create 2019-01-17 20:19
 */
public class Dog extends Animal {
    public Dog() {
    }

    public Dog(int age, String name) {
        super(age, name);
    }

    @Override
    public void show() {
        System.out.println("我叫"+getName()+",今年"+getAge()+"岁了,我的病症是感冒");
    }
}
