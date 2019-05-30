package com.itheima;

/**
 * @author wz
 * @create 2019-01-09 16:37
 */
//数组反转
public class ArrayReverse {
    public static void main(String[] args) {
//        定义一个整型数组
        int[] arr={12,1,21,3,1234,1,4,14,14,13,1,3,13,5,2,486,243,21,24456,6,36,3,7,42,34,132};
/*
//        第一种方法：利用指针原理
        int min=0;
        int max=arr.length-1;
        while (min<max){
//            数据交换
            int temp=arr[min];
            arr[min]=arr[max];
            arr[max]=temp;
//        指针变动
            min++;
            max--;
        }
//       遍历数组进行打印
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
*/

//        第二种方法：
//                           确定循环次数
        for (int i = 0; i < arr.length/2; i++) {
//            数据交换
            int temp1=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp1;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
