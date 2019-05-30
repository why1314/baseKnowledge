package com.itheima;

/**
 * @author wz
 * @create 2019-01-08 19:15
 */
/*在控制台打印出1~10之间能被3整除的数字;*/
public class Demo02 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
