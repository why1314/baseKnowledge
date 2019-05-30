package com.itheima.test07;

import java.util.Scanner;

/**
 * @author wz
 * @create 2019-01-16 12:36
 */
public class Demo_07 {
    public static void main(String[] args) {
        String str = "meom";
        boolean balance = balance(str);
        if (balance) {
            System.out.println(str + " 是一个回文字符串：" + balance);
        } else {
            System.out.println(str + " 不是一个回文字符串：" + balance);
        }
    }

    public static boolean balance(String str) {

        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 1 - i) {
                if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                    return false;
                }
            }

        }
        return true;
    }
}
