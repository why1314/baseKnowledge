package com.itheima;

/**
 * @author wz
 * @create 2019-01-14 10:03
 */
public class Dog {
    private String name;
    private int age;
    private double weight;
    private char gender;

    public Dog() {
    }

    public Dog(String name, int age, double weight, char gender) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void eat() {
        System.out.println("狗吃肉");

    }

    public void run() {
        System.out.println("追着猫跑");
    }

    public void sleep() {
        System.out.println("大白天睡觉");
    }


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

