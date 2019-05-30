package com.itheima.homework.test05;

/**
 * @author wz
 * @create 2019-01-17 21:15
 */
public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName()+"是一条狗，吃骨头！");
    }
}
