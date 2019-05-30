package com.itheima;

/**
 * @author wz
 * @create 2019-01-10 15:29
 */
/*在main方法中定义3个变量:int a = 5, b = 3, c = 8;
  使用if语句求出三个变量中的最大值，不考虑三个变量相等的情况，每一个变量的值都是不一样的！！
 */
public class TestDemo_04 {
    public static void main(String[] args) {
        int a = 5, b = 9, c = 8;
        int max = 0;
        if (a > b) {
            if (a > c) {
                max = a;
            } else {
                max = c;
            }
        } else if (c < b) {
            max = b;
        } else {
            max = c;
        }
        System.out.println(max);
    }
}
