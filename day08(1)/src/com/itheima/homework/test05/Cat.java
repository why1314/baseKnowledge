package com.itheima.homework.test05;

/**
 * @author wz
 * @create 2019-01-17 21:14
 */
public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName()+"是一只猫，吃鱼！");
    }
}
