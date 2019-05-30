package com.itheima;

/**
 * @author wz
 * @create 2019-01-17 16:39
 */
public class Student {
    private int age;
    private String name;
    private double score;

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

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Student() {

    }

    public Student(int age, String name, double score) {

        this.age = age;
        this.name = name;
        this.score = score;
    }
}
