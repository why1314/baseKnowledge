package com.itheima;

/**
 * @author wz
 * @create 2019-01-10 14:50
 */
/*
* 1.main方法中定义3个变量：int a = 5, b = 3, c = 8;
  利用三元运算符求出a、b、c中最小的数并打印到控制台上；
*/
public class TestDemo_01 {
    public static void main(String[] args) {
        int a = 5, b = 3, c = 8;
        int min = 0;
        if (a < b) {
            min = a < c ? a : c;
        } else {
            min = b < c ? b : c;
        }
        System.out.println(min);
    }
}
