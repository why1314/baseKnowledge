package com.itheima.homework.test03;

/**
 * @author wz
 * @create 2019-01-17 20:42
 */
public interface MyInterface {
    public default void methodA(){
        System.out.println("接口中的默认方法执行了");
    }
    public abstract void methodB();
}
