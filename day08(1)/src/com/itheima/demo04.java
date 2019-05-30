package com.itheima;

import java.util.ArrayList;

/**
 * @author wz
 * @create 2019-01-17 15:33
 */
public class demo04 {
    public static void main(String[] args) {
        Student s1 = new Student(10,"小米",69);
        Student s2 = new Student(20,"华为",85);
        Student s3 = new Student(30,"vivo",55);
        Student s4 = new Student(40,"oppo",60);
        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.println(student.getAge()+"-"+student.getName()+"-"+student.getScore());
            System.out.println("====================");
        }


    }


}
