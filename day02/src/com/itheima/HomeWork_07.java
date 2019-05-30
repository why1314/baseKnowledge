package com.itheima;

import java.util.Scanner;

/**
 * @author wz
 * @create 2019-01-06 21:08
 */
//自定义一个方法,计算出123数字中的个位,十位和百位的数字并打印到控制台;
public class HomeWork_07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个三位数整数值");

        int i = sc.nextInt();
        cout(i);
    }

    public static void cout(int a) {
        int ge, shi, bai;
//        对10取余求个位数
        ge = a % 10;
//        先对10取整，在对10取余求得十位数
        shi = a / 10 % 10;
//        两次对10取整得到百位数
        bai = a / 10 / 10;
        System.out.println(a + "的个位数为：" + ge);
        System.out.println(a + "的十位数为：" + shi);
        System.out.println(a + "的百位数为：" + bai);
    }

}
