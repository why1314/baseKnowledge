package com.itheima;

import java.util.Arrays;

/**
 * @author wz
 * @create 2019-01-11 20:34
 */
public class BubbleSortDemo {
    public static void main(String[] args) {
        int[] arr={12,33,24,36,52,53,43,63,25,72,68,61,14,23,54,246};
        bubble(arr);
    }

    public static void bubble(int[] arr) {
//      外层循环控制轮数：n-1
        for (int i = 0; i < arr.length - 1; i++) {
//            内层控制每轮循环对比的次数 ：n-1
            for (int j = 0; j < arr.length - 1-i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}

