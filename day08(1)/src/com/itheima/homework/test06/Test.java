package com.itheima.homework.test06;

import java.util.ArrayList;

/**
 * @author wz
 * @create 2019-01-17 21:21
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Goods> shoppingCart= new ArrayList<>();
        Goods g1 = new Goods("小米8", 2888.0);
        Goods g2 = new Goods("锤子2s", 2588.0);
        Goods g3 = new Goods("华为10", 2999.0);
        shoppingCart.add(g1);
        shoppingCart.add(g2);
        shoppingCart.add(g3);
        System.out.println("购物车中的商品有：");
        System.out.println("-----------------------------");
        for (int i = 0; i < shoppingCart.size(); i++) {
            Goods goods = shoppingCart.get(i);
            System.out.println("名称："+goods.getName()+"; 价格:"+goods.getPrice());
        }
        System.out.println("-----------------------------");
        System.out.println("购物车共有"+shoppingCart.size()+"件商品");
    }
}
