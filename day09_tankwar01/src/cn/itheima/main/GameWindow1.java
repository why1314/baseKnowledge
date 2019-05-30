package cn.itheima.main;

import cn.itheima.beans.*;
import cn.itheima.element.AbstractElement;
import cn.itheima.element.AbstractWindow;
import cn.itheima.utils.Config;
import cn.itheima.utils.SoundUtils;
import org.lwjgl.input.Keyboard;

import java.io.IOException;

/**
 * @author wz
 * @create 2019-01-18 18:35
 */
public class GameWindow1 extends AbstractWindow {
    public Tank tank;
    public long time;

    public GameWindow1(String title) {
        super(title);
        initElements();
    }

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

    @Override
    protected void onCreate() {
//     窗口创建时加载声音
        try {
            SoundUtils.play("res//snd//start.wav", true);
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

    @Override
    protected void onDisplayUpdate() {
        for (int i = 0; i < Config.eleList.size(); i++) {
            AbstractElement element = Config.eleList.get(i);
            element.draw();
        }
    }
}
