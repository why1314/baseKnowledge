package com.itheima;

import java.util.Random;

/**
 * @author wz
 * @create 2019-01-08 19:22
 */
/*随机生成5个[10~20]之间(含10和20)的随机数并打印出来;
  打印效果为(由于是随机生成的,所以每次运行效果都不相同):
*/
public class Demo05 {
    public static void main(String[] args) {
//      随机生成5个数  循环5次
        Random rd = new Random();
        for (int i = 0; i < 5; i++) {
//            10--20之间的随机数
            int num = rd.nextInt(11) + 10;
            System.out.println(num);

        }

    }
}
