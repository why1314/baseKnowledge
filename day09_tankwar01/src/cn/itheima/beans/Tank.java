package cn.itheima.beans;

import cn.itheima.element.AbstractTank;
import cn.itheima.utils.Config;

public class Tank extends AbstractTank {
    public Tank(int x, int y) {
        super(x, y, Config.MY_TANK_UP_IMG_PATH,1);
        //设置我方坦克血量
        this.setBlood(Config.MY_TANK_BLOOD);
        //设置我方坦克分组为0，如果双人游戏，可以避免自己打自己。
        //另外也与敌方坦克区分
        this.setGroup(0);
        //设置我方坦克血量
        this.speed = Config.MY_TANK_SPEED;
    }
}
