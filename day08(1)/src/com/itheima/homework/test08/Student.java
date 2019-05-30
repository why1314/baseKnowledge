package com.itheima.homework.test08;

/**
 * @author wz
 * @create 2019-01-17 21:42
 */
public class Student {
    private String name;
    private String mima;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMima() {
        return mima;
    }

    public void setMima(String mima) {
        this.mima = mima;
    }

    public Student() {

    }

    public Student(String name, String mima) {

        this.name = name;
        this.mima = mima;
    }
}
