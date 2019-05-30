package com.itheima;

import java.util.Scanner;

/**
 * @author wz
 * @create 2019-01-06 18:16
 */
public class testMethod {
    public static void main(String[] args) {

        char c = 'e';
        char ch = '5';
        System.out.println(c-ch);



        getMaxAndAvg();
    }

    public static void getMaxAndAvg() {
//        创建Scanner对象
        Scanner sc = new Scanner(System.in);


        System.out.println("请输入第一个人的年龄:");

        double age1 = sc.nextDouble();

        System.out.println("请输入第二个人的年龄:");

        double age2 = sc.nextDouble();

        double max = age1 > age2 ? age1 : age2;
        double avg = (age1 + age2) / 2;

        System.out.println("最大的年龄为："+max);

        System.out.println("平均的年龄为："+avg);
    }
}
