package com.itheima;

import java.util.Arrays;

/**
 * @author wz
 * @create 2019-01-11 15:10
 */
public class MethodDemo_04 {
    public static void main(String[] args) {
        int[] arr = {111, 2, 75, 64, 78, 26, 33, 78, 11, 179, 100};
        getSecond(arr);
    }

//    public static void getSecond() {
////        获得数组中中第二大的数
//        int[] arr = {111, 2, 75, 64, 78, 26, 33, 78, 11, 179, 100};
////        先求出最大的数和最小的数
//        int max = arr[0];
//        int min = arr[0];
//
//        for (int i = 1; i < arr.length; i++) {
//            if (max < arr[i]) {
//                max = arr[i];
//            }
//            if (min > arr[i]) {
//                min = arr[i];
//            }
//
//        }
////        利用最小值赋值给第二大值
//        int secondMax = min;
//
//        for (int i = 0; i < arr.length; i++) {
////            循环遍历数组中的每个值，arr[i] 大于secondMax且不等于最大值
//            if (secondMax < arr[i] && arr[i] != max) {
//                secondMax = arr[i];
//            }
//        }
//        System.out.println("第二大的值为：" + secondMax);
//    }

    //    利用选择排序思想进行筛选：一次选中每个元素不动，其他元素与此进行来比较


    public static void getSecond(int[] arr) {
//          外层控制不动元素
        for (int j = 0; j < arr.length - 1; j++) {
//            内层控制不动元素后的其他元素与不动元素进行比较
            for (int i = j + 1; i < arr.length; i++) {
//                不动元素
                if (arr[j] > arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println("第二大的值为：" + arr[arr.length-2]);
        System.out.println(Arrays.toString(arr));
    }

}

