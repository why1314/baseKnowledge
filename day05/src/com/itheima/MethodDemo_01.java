package com.itheima;

/**
 * @author wz
 * @create 2019-01-11 9:53
 */
public class MethodDemo_01 {
    public static void main(String[] args) {
//        赋值调用
        int sum=add(100,20);
        System.out.println(sum);
//        输出调用
        System.out.println(add(10,20));
//        单独调用
        add(20,20);

    }

    //    定义整数相加的方法
    public static int add(int a,int b){
        return a+b;
    }
}
