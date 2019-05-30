package com.itheima.pm.test2;

/**
 * @author wz
 * @create 2019-01-20 16:29
 */
public class Outer {
    public int num = 10;
    class Inner {
        public int num = 20;
        public void show() {
            int num = 30;
            System.out.println(num);//就进原则
            System.out.println(this.num);
            //System.out.println(new Outer().num);
//            System.out.println(super.num);

        }
    }
}
class InnerClassTest {
    public static void main(String[] args) {
        Outer.Inner oi = new Outer().new Inner();
        oi.show();
    }
}
