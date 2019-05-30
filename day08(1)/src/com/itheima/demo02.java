package com.itheima;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author wz
 * @create 2019-01-17 15:33
 */
public class demo02 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 6; i++) {
            int i1 = random.nextInt(33) + 1;
            list.add(i1);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
