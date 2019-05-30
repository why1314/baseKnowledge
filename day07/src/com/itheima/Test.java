package com.itheima;

import java.util.ArrayList;

/**
 * @author wz
 * @create 2019-01-15 19:16
 */
public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Animal animal=cat;
        feed(animal);

        Animal dog = new Dog();
        feed(dog);

        feed(new Pig());


    }

    public static void feed(Animal animal) {
        System.out.println("吃饭喽！！！");
        animal.eat();
    }
}
