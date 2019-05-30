package com.itheima.test06;

/**
 * @author wz
 * @create 2019-01-16 11:40
 */

public class Book {
    private double price;//价格
    private String id;//编号
    private String name;//名称


    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book() {
    }

    public Book(double price, String id, String name) {

        this.price = price;
        this.id = id;
        this.name = name;
    }

    public void show() {
        System.out.println("编号为" + id + "的" + name + ",售价为：" + price);
    }


    public static void main(String[] args) {
        Book book1 = new Book(38.8,"No0001","java入门");
        Book book2 = new Book(68.8,"No0002","java高级");
        Book book3 = new Book(29.8,"No0003","Java虚拟机");
        book1.show();
        book2.show();
        book3.show();
    }
}
