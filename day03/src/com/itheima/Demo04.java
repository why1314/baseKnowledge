package com.itheima;

/**
 * @author wz
 * @create 2019-01-08 19:19
 */
/*在控制台打印出1~20之间不能被5整除的数字;*/
public class Demo04 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i%5==0){
                continue;
            }else {
                System.out.println(i);
            }

        }
    }
}
