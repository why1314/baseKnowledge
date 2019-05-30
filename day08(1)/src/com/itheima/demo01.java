package com.itheima;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * @author wz
 * @create 2019-01-17 15:20
 */
public class demo01 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(12);
        integers.add(123);
        integers.add(14);
        integers.add(15);
        integers.add(16);
        integers.add(172);
        System.out.println(integers);
        for (int i = 0; i < integers.size(); i++) {
            System.out.println(integers.get(i));
        }
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
