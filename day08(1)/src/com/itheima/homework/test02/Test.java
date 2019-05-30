package com.itheima.homework.test02;

/**
 * @author wz
 * @create 2019-01-17 20:37
 */
public class Test {
    public static void main(String[] args) {
        Graph graph = new Square();
        System.out.println("正方形的周长是："+graph.getGirth(2.5));
        System.out.println("正方形的面积是："+graph.getArea(2.5));

        Graph circular = new Circular();
        System.out.println("圆形的周长是："+circular.getGirth(2.5));
        System.out.println("圆形的面积是："+circular.getArea(2.5));
    }
}
