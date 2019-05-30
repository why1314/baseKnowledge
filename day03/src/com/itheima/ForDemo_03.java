package com.itheima;

import jdk.nashorn.internal.ir.IfNode;

/**
 * @author wz
 * @create 2019-01-08 12:00
 */
public class ForDemo_03 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
