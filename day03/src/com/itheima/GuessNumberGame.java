package com.itheima;

import java.util.Random;
import java.util.Scanner;


/**
 * @author wz
 * @create 2019-01-08 19:01
 */
/*
* 猜数游戏
* */
public class GuessNumberGame {
    public static void main(String[] args) {
//        获得1--100的随机数
        Random random = new Random();
        int number = random.nextInt(100) + 1;
//        获得控制板输入的数值
        Scanner sc = new Scanner(System.in);

//         死循环控制
        while (true){
            System.out.println("请输入1--100以内的整数值：");
            int guessNumber = sc.nextInt();
            if (guessNumber>number){
                System.out.println("猜大了");
            }else if (guessNumber<number){
                System.out.println("猜小了");
            }else {
                System.out.println("恭喜您，猜对了！");
                break;
            }
        }
    }
}
