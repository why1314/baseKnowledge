package com.itheima;

import java.util.Scanner;

/**
 * @author wz
 * @create 2019-01-06 20:46
 */
//模拟一个上网吧的场景.
//要求,年龄必须大于或等于18岁,并且兜里的钱超过10块钱才可以去网吧,
// 否则不能去网吧;现在19岁的小明,兜里装了20块钱,使用代码打印小明去网吧的效果;

//    同时满足大于或等于18且兜里的钱超过10块钱
//             >=        &&    >
public class HomeWork_03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("您的年龄为：");
        int age = sc.nextInt();
        System.out.println("您有多少钱：");
        double money = sc.nextDouble();

        String s = age >= 18 && money > 10 ? "您能上网" : "您不能上网";
        System.out.println(s);

    }
}
