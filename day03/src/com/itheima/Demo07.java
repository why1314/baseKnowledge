package com.itheima;

import javax.sound.midi.Soundbank;

/**
 * @author wz
 * @create 2019-01-08 19:44
 */
/*
* 在控制台打印出九九乘法表;*/
public class Demo07 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }
            System.out.println();
        }
    }
}
