package com.itheima;

/**
 * @author wz
 * @create 2019-01-08 19:26
 */

/*
*模拟超市结算系统，
当商品总金额 >=500时，打6折优惠；
当商品总金额 >=300 且<500时,打7折优惠；
当商品总金额 >=100 且<300时,打8折优惠；
当商品总金额 >=50  且<100时,打9折优惠；
低于50不打折；
假如现在一共有3种商品, 每种买了一个，价格分别是： 19.8,39.9,299;请使用程序打印出结算的效果
* */
public class Demo06 {

    public static void main(String[] args) {
         double a=19.8;
         double b=39.9;
         double c=299;
         double sum=a+b+c;
         if (sum>=500){
             sum*=0.6;
         }else if (sum>=300){
             sum*=0.7;
         }else if (sum>=100){
             sum*=0.8;
         }else if (sum>=50){
             sum*=0.9;
         }
        System.out.println(sum);
    }

}
