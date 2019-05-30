package com.itheima.test09;

import java.util.Scanner;

/**
 * @author wz
 * @create 2019-01-16 15:25
 */
public class Demo_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个QQ号码");
        String next = sc.next();
        System.out.println(isQual(next));
    }

    public static String isQual(String str) {
        if (str.length() < 5 || str.length() > 13) {
            return "对不起，您输入的QQ号码长度不符合规定";
        }
        if (str.startsWith("0")) {
            return "对不起，QQ号码不能以0开头";
        }
        for (int i = 0; i < str.length(); i++) {
            if (!(str.charAt(i) >= '0' && str.charAt(i) <= '9')) {
                return "对不起，QQ号码中只能包含数字";
            }
        }
        return "您输入的QQ号码符合规定，号码是：" + str;

    }
}
