package cn.itheima.beans;

import cn.itheima.element.AbstractTank;
import cn.itheima.utils.CollsionUtils;
import cn.itheima.utils.Config;

import java.util.Random;

public class EnemyTank extends AbstractTank {

    public EnemyTank(int x, int y) {
        super(x, y, Config.ENEMY_TANK_DOWN_IMG_PATH, 2);
        //设置敌方坦克血量
        this.setBlood(Config.ENEMY_TANK_BLOOD);
        //设置敌方坦克分组为1，可以避免自己打自己
        this.setGroup(1);
        //设置敌方坦克移动速度
        this.speed = Config.ENEMY_TANK_SPEED;

    }

    @Override
    public boolean isTankAcross() {
        return true;
    }
}
