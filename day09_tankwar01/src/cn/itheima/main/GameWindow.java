package cn.itheima.main;

import cn.itheima.element.AbstractElement;
import cn.itheima.element.AbstractWindow;
import cn.itheima.beans.*;
import cn.itheima.utils.Config;
import cn.itheima.utils.SoundUtils;
import org.lwjgl.input.Keyboard;


import java.io.IOException;
import java.util.ArrayList;


/**
 * @Author: zhanyingpeng
 * @Date: 2018/11/12 18:39
 */
public class GameWindow extends AbstractWindow {
    //    定义一个成员变量tank
    public Tank tank;
    public long time = 0;

    //GameWindow的构造方法
    public GameWindow(String title) {
        super(title);
//        向窗口添加元素
        initElements();
    }

    /**
     * 功能描述: 窗口打开时添加各种元素
     *
     * @Author:wz
     * @Date: 2019/1/18 14:26
     */
    public void initElements() {

//        我方坦克
        tank = new Tank(64 * 7, 64 * 8);
        Config.eleList.add(tank);

//        一排砖墙
        for (int i = 0; i < 14; i++) {
            Wall wall = new Wall(64 * i, 64 * 1);
            Config.eleList.add(wall);
        }
//         一排铁墙
        for (int i = 1; i < 15; i++) {
            Steel steel = new Steel(64 * i, 64 * 3);
            Config.eleList.add(steel);
        }
//         一排水墙
        for (int i = 0; i < 15; i++) {
            if (i == 3 || i == 9) {
                Steel steel = new Steel(64 * i, 64 * 5);
                Config.eleList.add(steel);
                continue;
            }
            if (i == 7) {
                continue;
            }
            Water water = new Water(64 * i, 64 * 5);
            Config.eleList.add(water);
        }
//         一排草墙
        for (int i = 0; i < 15; i++) {
            if ((i % 2) == 1) {
                Grass grass = new Grass(64 * i, 64 * 7);
                Config.eleList.add(grass);
            } else {
                Wall wall = new Wall(64 * i, 64 * 7);
                Config.eleList.add(wall);
            }
        }

//    敌方坦克
        for (int i = 0; i < 15; i++) {
            if (i == 5) {
                continue;
            }
            EnemyTank enemyTank1 = new EnemyTank(64 * 1, 64 * i);
            Config.eleList.add(enemyTank1);
            EnemyTank enemyTank2 = new EnemyTank(64 * i, 64 * 0);
            Config.eleList.add(enemyTank2);
        }
//


    }

    // 窗口创建是调用的方法
    @Override
    protected void onCreate() {
//        声音播放
        try {
            SoundUtils.play("res//snd//start.wav");//只播放一次
            SoundUtils.play("res//snd//start.wav", true);//循环播放
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void onMouseEvent(int key, int x, int y) {

    }

    @Override
    protected void onKeyEvent(int key) {
        if (key == Keyboard.KEY_UP) {
            if (tank.getDirection() == 1) {
                tank.move();//让坦克移动
                return;
            }
            tank.setDirection(1);//设置坦克的方向
        } else if (key == Keyboard.KEY_DOWN) {
            if (tank.getDirection() == 2) {
                tank.move();//让坦克移动
                return;
            }
            tank.setDirection(2);
        } else if (key == Keyboard.KEY_LEFT) {
            if (tank.getDirection() == 3) {
                tank.move();//让坦克移动
                return;
            }
            tank.setDirection(3);
        } else if (key == Keyboard.KEY_RIGHT) {
            if (tank.getDirection() == 4) {
                tank.move();//让坦克移动
                return;
            }
            tank.setDirection(4);
        } else if (key == Keyboard.KEY_RETURN) {

            long start = System.currentTimeMillis();
            if (start - time > 200) {
//              创建子弹
                Bullet bullet = new Bullet(tank);
//              添加到集合中
                Config.eleList.add(bullet);
//              记录当前发射子弹的时间
                time = System.currentTimeMillis();

            }
        }
    }

    //  刷新频率
    @Override
    protected void onDisplayUpdate() {
//        把游戏集合中的所有元素都画到窗口上
//        把集合中的所有元素遍历出来
        for (int i = 0; i < Config.eleList.size(); i++) {
            AbstractElement element = Config.eleList.get(i);
//            画到窗口
            element.draw();
        }
    }
}
