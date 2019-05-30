package com.itheima;

/**
 * @author wz
 * @create 2019-01-08 19:16
 */
/*在控制台打印出1~10之间的奇偶性;*/
public class Demo03 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i%2==0){
                System.out.println(i+"是偶数");
            }else {
                System.out.println(i+"是奇数");

            }
        }
    }
}
