package com.itheima.test05;

import java.util.Arrays;

/**
 * @author wz
 * @create 2019-01-16 11:31
 */
public class Person {
    private String name;
    private String[] hobby;
    private int age;

    public Person(String name, String[] hobby, int age) {
        this.name = name;
        this.hobby = hobby;
        this.age = age;
    }

    public Person() {

    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show() {
        String string = Arrays.toString(hobby);
        String substring = string.substring(1, string.length() - 1);
        System.out.println(age + "岁的" + name + ",爱好是：" + substring);
    }

    public static void  main(String[] args) {
        Person person = new Person();
        person.setName("小强");
        person.setAge(18);
        person.setHobby(new String[]{"抽烟", "喝酒", "烫头"});
        person.show();
    }
}
