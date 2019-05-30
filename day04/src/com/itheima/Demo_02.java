package com.itheima;

import java.util.Arrays;

/**
 * @author wz
 * @create 2019-01-09 18:24
 */
/*
* 在main方法中定义如下数组并按照指定格式打印出来;
数组元素为: 1,2,3,4,5
打印效果为(每个元素之间使用逗号分隔,且前后有[]):
*/
public class Demo_02 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        String string = Arrays.toString(arr);
        System.out.println(string);
    }
}
