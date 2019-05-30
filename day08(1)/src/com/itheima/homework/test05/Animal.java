package com.itheima.homework.test05;

/**
 * @author wz
 * @create 2019-01-17 20:58
 */
public abstract class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal() {

    }

    public Animal(String name) {

        this.name = name;
    }


    public abstract void eat();
}
