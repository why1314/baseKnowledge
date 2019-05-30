package com.itheima;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author wz
 * @create 2019-01-10 15:00
 */

/*
 *
 * 数组中有能够被2和3整除的元素打印效果:
 * */
public class TestDemo_03 {
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

//        ==============下面为在第二题的基础上做的第三题=====================
//       定义一个计数器，用于记录是否有能够被2和3整除的数
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0&&arr[i]%3==0){
                System.out.println("能够被2和3整除的数："+arr[i]);
                count++;
            }
        }
//        循环结束后如果count为0，则表示数组中没有能够被2和3整除的数
        if (count==0){
            System.out.println("数组中没有能够被2和3整除的数");
        }
    }
}
