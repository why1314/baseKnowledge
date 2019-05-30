package com.itheima;

/**
 * @author wz
 * @create 2019-01-12 19:32
 */
//自定义4个方法，完成打印任意整数的功能;要求这4个方法的以重载的形式编写；
public class Demo_01 {
    public static void main(String[] args) {
        print(1);
        byte b=2;
        print(b);
        short s=3;
        print(s);
        long l=4;
        print(l);
    }

    public static void print(byte b) {

        System.out.println("byte类型参数的方法" + b);
    }

    public static void print(int b) {

        System.out.println("int类型参数的方法" + b);
    }

    public static void print(long b) {

        System.out.println("long类型参数的方法" + b);
    }

    public static void print(short b) {

        System.out.println("short类型参数的方法" + b);
    }

}
