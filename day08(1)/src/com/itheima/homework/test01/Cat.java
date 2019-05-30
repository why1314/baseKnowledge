package com.itheima.homework.test01;



/**
 * @author wz
 * @create 2019-01-17 20:17
 */
public class Cat extends Animal {
    public Cat() {
    }

    public Cat(int age, String name) {
        super(age, name);
    }

    @Override
    public void show() {
        System.out.println("我叫"+getName()+",今年"+getAge()+"岁了,我的病症是发烧");
    }
}
