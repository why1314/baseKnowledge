package com.itheima;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author wz
 * @create 2019-01-17 15:33
 */
public class demo03 {
    public static void main(String[] args) {

        ArrayList<Integer> integers = get(80, 20);
        for (int i = 0; i < integers.size(); i++) {
            System.out.println(integers.get(i));
        }
    }

    public static ArrayList<Integer> get(int a, int b) {
        ArrayList<Integer> list = new ArrayList<>();
        int sum = a + b;
        int sub = a - b;
        int divide = a / b;
        int mul = a * b;
        list.add(sum);
        list.add(sub);
        list.add(divide);
        list.add(mul);
        return list;
    }
}
