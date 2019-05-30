package com.itheima.am.test1;

/**
 * @author wz
 * @create 2019-01-20 10:39
 */
public class Body {
    int age=28;
    String name="啦啦啦啦啦";

    class Heart{
        int count=1111;
        public void jump(){
            System.out.println("名字为"+name+"，年龄为"+age+"岁的心脏每分钟跳动"+count+"次");
        }
    }

    public static void main(String[] args) {
        Body.Heart bh=new Body().new Heart();
        bh.jump();
    }
}
