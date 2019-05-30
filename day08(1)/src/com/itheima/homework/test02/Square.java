package com.itheima.homework.test02;

/**
 * @author wz
 * @create 2019-01-17 20:31
 */
//正方形
public class Square extends Graph {
//    正方形的周长

    @Override
    public double getGirth(double d) {
        return d*4;
    }
    //        正方形的面积
    @Override
    public double getArea(double d) {
        return d*d;
    }
}
