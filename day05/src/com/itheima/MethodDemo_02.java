package com.itheima;

/**
 * @author wz
 * @create 2019-01-11 11:21
 */
/*
* .请定义方法，接收一个长方形的长、宽（均为正数），在方法中输出长方形的周长
* */
public class MethodDemo_02 {
    public static void main(String[] args) {
        circle(20,30);
    }
//    定义求周长的方法

    /**
     * @author wz
     * @param  a,b
     */

    public static void circle(int a,int b){
        System.out.println(2*(a+b));
    }
}
