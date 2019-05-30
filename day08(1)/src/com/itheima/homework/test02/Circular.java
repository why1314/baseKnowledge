package com.itheima.homework.test02;

/**
 * @author wz
 * @create 2019-01-17 20:35
 */
public class Circular extends Graph {
//
    @Override
    public double getGirth(double d) {
        return 2*Math.PI*d;
    }

    @Override
    public double getArea(double d) {
        return Math.PI*d*d;
    }
}
