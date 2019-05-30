package com.itheima;

/**
 * @author wz
 * @create 2019-01-06 20:59
 */

//自定义一个方法,在方法中实现使用-=运算符将小写字母’a’变成大写字母’A’;
public class HomeWork_05 {
    public static void main(String[] args) {
        trans();
    }

    public static void trans() {
        char ch='a';
        ch-=32;
        System.out.println(ch);
    }
}
