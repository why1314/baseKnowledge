package com.itheima.homework.test03;

/**
 * @author wz
 * @create 2019-01-17 20:44
 */
public class Test implements MyInterface {
    @Override
    public void methodB() {
        System.out.println("实现类重写的方法执行了");
    }

    public static void main(String[] args) {
        MyInterface test = new Test();
        test.methodA();
        test.methodB();
    }
}
