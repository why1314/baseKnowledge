package com.itheima;

import java.util.Scanner;

/**
 * @author wz
 * @create 2019-01-06 20:32
 */

//判断自己的年龄是偶数还是奇数,并将结果打印到控制台
public class HomeWork_01 {
    public static void main(String[] args) {
        //创建对象
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入您的年龄：");
        int age = sc.nextInt();

        String s = age % 2 == 0 ? "偶数" : "奇数";

        System.out.println("您的年龄为："+age+"岁,是"+s);

    }

}
