package com.itheima.variable;

import java.util.Scanner;

public class VariableDemo {
    //    public static void main(String[] args) {
//        byte num1 = 10;
//        System.out.println(num1);
//        short num2 = 20;
//        System.out.println(num2);
//        int num3 = 30;
//        System.out.println(num3);
//        long num4 = 40;
//        System.out.println(num4);
//        float num5 = 3.14158741087f;
//        System.out.println(num5);
//        double num6 = 5.2361723;
//        System.out.println(num6);
//        char var = 'a';
//        System.out.println(var);
//        boolean bool = true;
//        System.out.println(bool);
//        String string = "\t \'\"gsdkhfgaskd";
//        System.out.println(string);
//        System.out.println("王壮");
//        System.out.println(true);
//        System.out.println(false);
//        System.out.println(12345678910L);
//        System.out.println(3.141592653);
//        System.out.println(false);
//        System.out.print('j');
//        System.out.print('a');
//        System.out.print('v');
//        System.out.print('a');
//
//
//    }
    public static void main(String[] args) {
        String myName = "王壮";
        int myAge = 24;
        char myGender = '男';
        System.out.println(myName);
        System.out.println(myAge);
        System.out.println(myGender);

        int var1 = 5;
        int var2 = 6;
        System.out.println("变量交换前：var1=" + var1);
        System.out.println("变量交换前：var2=" + var2);

        int var;
        var = var1;
        var1 = var2;
        var2 = var;
        System.out.println("变量交换后：var1=" + var1);
        System.out.println("变量交换后：var2=" + var2);

        Scanner sic = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int a = sic.nextInt();
        System.out.println("dgakyd\n\"1212");
//       创建Scanner对象
        Scanner sc = new Scanner(System.in);

        System.out.println("");
//      接受输入的整数值
        int i = sc.nextInt();


    }
}
