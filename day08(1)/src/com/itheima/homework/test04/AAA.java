package com.itheima.homework.test04;

/**
 * @author wz
 * @create 2019-01-17 20:49
 */
//实现类对象  通过  默认方法  调用接口中的  静态方法完成打印10次
public interface AAA {
    public default void printA(String string){
        AAA.printB(string);
    }
    public static void printB(String string){
        for (int i = 0; i < 10; i++) {
            System.out.print(string+"\t");
        }
    }
}
