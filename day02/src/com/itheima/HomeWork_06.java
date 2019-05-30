package com.itheima;

import com.sun.org.apache.xpath.internal.SourceTree;
import sun.font.TrueTypeFont;

/**
 * @author wz
 * @create 2019-01-06 21:04
 */
//通过++运算符,写一个表达式让变量a =5和变量b=6两个变量比较的时候得到true,比较完之后,a变成6,b变成7;
public class HomeWork_06 {
    public static void main(String[] args) {
        int a=5;
        int b=6;
        String result = ++a == b++ ? "true" : "fale";
        System.out.println("resut="+result+",a="+a+",b="+b);

    }
}
