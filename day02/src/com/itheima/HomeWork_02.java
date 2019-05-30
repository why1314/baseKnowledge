package com.itheima;

/**
 * @author wz
 * @create 2019-01-06 20:38
 */

//1.将大写字母’A’转成小写字母’a’并打印到控制台:
//2.获取小数6.6的整数部分并打印到控制台;
public class HomeWork_02 {

    public static void main(String[] args) {
        trans('A');
        double d=6.6;
        int num=(int) d;
        System.out.println(num);
    }

    public static void trans(char ch){

        char c = (char) (ch + 32);
        System.out.println(c);

    }
}
