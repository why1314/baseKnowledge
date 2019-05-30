package com.itheima.homework.test08;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author wz
 * @create 2019-01-17 21:44
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student jack = new Student("jack", "123");
        Student rose = new Student("rose", "456");
        list.add(jack);
        list.add(rose);
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String name = sc.next();

        System.out.println("请输入密码");
        String mima = sc.next();

        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            if (name.equals(s.getName())) {
                if (mima.equals(s.getMima())) {
                    System.out.println("登陆成功，欢迎您：" + name);
                } else {
                    System.out.println("密码错误！");
                }
                return;
            }
        }
        System.out.println(name + " 不存在！");
    }
}
