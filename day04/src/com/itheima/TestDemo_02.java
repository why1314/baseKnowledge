package com.itheima;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author wz
 * @create 2019-01-10 15:00
 */
/* 第二题
*  自定义一个数组,数组长度通过键盘录入指定,长度定义在3到5位之间.数组中的元素也通过键盘录入.
*  提示:Scanner,遍历数组,给每个元素赋值
* */

public class TestDemo_02 {
    public static void main(String[] args) {
//        创建对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组的长度，长度在3到5位之间");
//         数组长度
        int lengths = sc.nextInt();
//      创建数组
        int[] arr = new int[lengths];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第"+(i+1)+"个元素");
            int element = sc.nextInt();
            arr[i]=element;
        }
        System.out.println("============================");
        String str = Arrays.toString(arr);
        System.out.println(str);


    }
}
