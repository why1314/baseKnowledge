package com.itheima.test10;

/**
 * @author wz
 * @create 2019-01-16 15:56
 */
public class Person {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person() {

    }

    public Person(int age, String name) {

        this.age = age;
        this.name = name;
    }

    public void show() {
        System.out.println("我是" + name + ",今年" + age + "岁");
    }
}
