package com.itheima.homework.test07;

import java.util.ArrayList;

/**
 * @author wz
 * @create 2019-01-17 21:30
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("dddeee");
        list.add("fffggg");
        System.out.println("集合中删除长度为5的字符串前：" + list);

        ArrayList<String> list1 = new ArrayList<String>();

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (s.length()>5){
                String remove = list.remove(i);//删除以后长度减一
                i--;
                list1.add(remove);
            }
        }
        System.out.println("集合中删除长度为5的字符串后：" + list);
        System.out.println("被删除字符串：" + list1);
    }
}
