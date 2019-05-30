package com.itheima.homework.test06;

/**
 * @author wz
 * @create 2019-01-17 21:20
 */
//商品
public class Goods {
    private String name;//商品名称
    private double price;//商品价格

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Goods() {

    }

    public Goods(String name, double price) {

        this.name = name;
        this.price = price;
    }
}
