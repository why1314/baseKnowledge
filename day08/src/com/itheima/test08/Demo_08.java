package com.itheima.test08;

import java.util.Scanner;

/**
 * @author wz
 * @create 2019-01-16 12:56
 */
public class Demo_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大字符串");
        String next1 = sc.next();
        System.out.println("请输入一个小字符串");
        String next2 = sc.next();
        String replace = next1.replace(next2, "");
//        减少的长度
        int i = next1.length() - replace.length();
        int num = i / next2.length();
        System.out.println("大字符串：" + next1);
        System.out.println("小字符串：" + next2);
        System.out.println("大字符串使用replace方法替换后：" + replace);
        System.out.println("这样一来,长度一共减少了" + i + ",而小字符串的长度为"
                + next2.length() + ",那么" + next2 + "出现的次数就是" + num + "次");

    }
}
