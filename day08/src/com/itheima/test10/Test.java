package com.itheima.test10;

/**
 * @author wz
 * @create 2019-01-16 15:46
 */
public class Test {
    public static void main(String[] args) {
        Person teacher = new Teacher(35, "张老师");
        Person student = new Student(20, "小明");

        teacher.show();
        if (teacher instanceof Teacher) {
            Teacher t = (Teacher) teacher;
            t.teach();
        }

        student.show();
        if (student instanceof Student) {
            Student s = (Student) student;
            s.study();
        }
    }
}
