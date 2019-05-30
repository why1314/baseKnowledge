package com.itheima;

import java.util.Arrays;

/**
 * @author wz
 * @create 2019-01-12 17:34
 */
//冒泡排序
public class SortDemo {
    public static void main(String[] args) {
        int[] arr = {122, 23, 214, 51, 32, 65, 43, 56, 67, 43, 72, 53, 87, 82, 65, 92, 59, 93};
        bubbleSort(arr);
        selectSort(arr);
    }

    public static void bubbleSort(int[] arr) {
//       冒泡思想：相邻元素之间的比较
//        外层最多到[arr.length-2]
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void selectSort(int[] arr) {
//        选择思想：选择一元素不动，其后的元素与其一一对比
//        外层循环控制不动元素：最多到arr.length-2
        for (int i = 0; i < arr.length - 1; i++) {
//            内层元素控制变动元素 最多到arr.length - 1
            for (int j = i + 1; j < arr.length; j++) {
//                  不动元素   变动元素
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }

            }

        }
        System.out.println(Arrays.toString(arr));
    }
}


