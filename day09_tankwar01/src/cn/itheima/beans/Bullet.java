package cn.itheima.beans;

import cn.itheima.element.AbstractBullet;
import cn.itheima.element.AbstractTank;
import cn.itheima.utils.SoundUtils;

import java.io.IOException;

public class Bullet extends AbstractBullet {

    public Bullet(AbstractTank tank) {
        super(tank);
        try {
            SoundUtils.play("res\\snd\\fire.wav");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
