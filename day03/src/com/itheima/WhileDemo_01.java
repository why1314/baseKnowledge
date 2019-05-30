package com.itheima;

import com.sun.imageio.plugins.common.I18N;

/**
 * @author wz
 * @create 2019-01-08 14:44
 */
public class WhileDemo_01 {
    public static void main(String[] args) {
//        用于存储累加和的值
        int sum = 0;
//        初始化条件
        int i = 1;

//          判断条件
        while (i < 101) {
//            循环体语句
            if (i % 2 == 1) {
                sum += i;
            }
//       自增语句
            i++;
        }


        System.out.println(sum);



    }
}
