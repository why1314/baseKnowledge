package cn.itheima.element;

import cn.itheima.utils.CollsionUtils;
import cn.itheima.utils.Config;
import cn.itheima.utils.SoundUtils;

import java.io.IOException;

public abstract class AbstractBullet extends AbstractElement {
    //坦克
    private AbstractTank tank;
    //子弹方向:1:上，2：下，3：左，4：右
    private int direction = 1;
    //移动速度
    private int speed = 8;



    public AbstractBullet(AbstractTank tank) {
        super(0, 0, "");
        this.tank = tank;
        //设置与坦克相同方向
        this.direction = tank.getDirection();
        //根据坦克的位置，重新设置子弹的位置
        switch (direction) {
            case 1://上
                this.setImgPath(Config.My_BULLET_UP_IMG_PATH);
                this.setWidth(16);
                this.setHeight(32);
                this.setX(this.tank.getX() + ((this.tank.getWidth() - this.getWidth()) / 2));
                this.setY(this.tank.getY() - 20);
                break;
            case 2://下
                this.setImgPath(Config.My_BULLET_DOWN_IMG_PATH);
                this.setWidth(16);
                this.setHeight(32);
                this.setX(this.tank.getX() + ((this.tank.getWidth() - this.getWidth()) / 2));
                this.setY(this.tank.getY() + this.tank.getHeight() - 10);
                break;
            case 3://左
                this.setImgPath(Config.My_BULLET_LEFT_IMG_PATH);
                this.setWidth(32);
                this.setHeight(16);
                this.setX(this.tank.getX() - 20);
                this.setY(this.tank.getY() + ((this.tank.getHeight() - this.getHeight()) / 2));
                break;
            case 4://右
                this.setImgPath(Config.My_BULLET_RIGHT_IMG_PATH);
                this.setWidth(32);
                this.setHeight(16);
                this.setX(this.tank.getX() + this.tank.getWidth() - 10);
                this.setY(this.tank.getY() + ((this.tank.getHeight() - this.getHeight()) / 2));
                break;
        }
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;


    }

    @Override
    public void draw() {
        switch (this.direction) {
            case 1://上
                if (this.getY() < 0 ||
                        !canMove()) {
                    Config.eleList.remove(this);
                    return;
                }
                this.setY(this.getY() - speed);
                break;
            case 2://下
                if (this.getY() + this.getHeight() > Config.WINDOW_HEIGHT ||
                        !canMove()) {
                    Config.eleList.remove(this);
                }
                this.setY(this.getY() + speed);
                break;
            case 3://左
                if (this.getX() + this.getWidth() < 0 ||
                        !canMove()) {
                    Config.eleList.remove(this);
                }
                this.setX(this.getX() - speed);
                break;
            case 4://右
                if (this.getX() > Config.WINDOW_WIDTH ||
                        !canMove()) {
                    Config.eleList.remove(this);
                }
                this.setX(this.getX() + speed);
                break;


        }
        super.draw();
    }

    //判断是否可移动
    private boolean canMove() {
        for (AbstractElement e : Config.eleList) {
            if (!e.isBulletAcross() && e != this.tank && e.getGroup() != this.tank.getGroup()) {
                int tx1 = this.getX();
                int ty1 = this.getY();

                if(CollsionUtils.isCollsionWithRect(e.getX(),e.getY(),e.getWidth(),e.getHeight(),
                        tx1,ty1,this.getWidth(),this.getHeight()
                )){
                    //显示爆炸
                    if (e.getBlood() == 1) {//目标被打死
                        Config.eleList.add(new Blast(e));
                        Config.eleList.remove(e);
                        try {
                            SoundUtils.play(Config.SND_BLAST);
                        } catch (IOException e1) {
                            e1.printStackTrace();
                        }

                    }else {//目标掉血
                        e.setBlood(e.getBlood() - 1);
                        Config.eleList.add(new Blast(e));
                        try {
                            SoundUtils.play(Config.SND_HIT);

                        } catch (IOException e1) {
                            e1.printStackTrace();
                        }
                    }
                    return false;//不能移动
                }
            }
        }
        return true;
    }
}
