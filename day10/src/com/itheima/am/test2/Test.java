package com.itheima.am.test2;

/**
 * @author wz
 * @create 2019-01-20 11:12
 */
public class Test {
    public static void main(String[] args){
        Animal animal=new Animal(){
            public  void eat(){
                System.out.println("dhagksdygalsyud");
            }

            public  void sleep(){
                System.out.println("的就嘎，和安静的歌");
            }
        };

        animal.eat();
        animal.sleep();

        JiDu jidu=new JiDu(){
          public   void jidu(){
                System.out.println("上的嘎斯");
            }
            public  void biubiubiu(){
                System.out.println("开枪");
            }

        };

        jidu.jidu();
        jidu.biubiubiu();


    }
}
