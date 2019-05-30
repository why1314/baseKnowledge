package com.itheima;

/**
 * @author wz
 * @create 2019-01-09 18:21
 */
/*
* 在main方法中定义如下数组并按照指定格式打印出来;
  数组元素为: 1,2,3,4,5
  打印效果为(每个元素之间使用空格分隔):
*/
public class Demo_01 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }

    }
}
