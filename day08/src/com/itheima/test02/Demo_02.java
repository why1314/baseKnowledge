package com.itheima.test02;

/**
 * @author wz
 * @create 2019-01-16 10:37
 */
/*
 * 自定义一个方法完成将指定数字转成对应字符并返回的方法；
 *具体要求：如果指定数字对应的是数字字符或英文字符可以直接转换，其他字符返回空格，并提示以空格替换；
 */
public class Demo_02 {
    public static void main(String[] args) {
        int num=123;
        char c = transNumToChar(num);
        System.out.println(num+"转换后的字符是:"+c);


    }

    public static char transNumToChar(int num) {
        char ch =' ';
        if (num >= 'a' && num <= 'z') {
            ch = (char) num;
        } else if (num >= 'A' && num <= 'Z') {
            ch = (char) num;
        } else if (num >= '0' && num <= '9') {
            ch = (char) num;
        }else {
            System.out.println("不是数字字符也不是字母字符，将以空格替代");
            ch=' ';
        }
        return ch;
    }

}
