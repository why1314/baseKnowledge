package cn.itheima.element;

import cn.itheima.beans.Bullet;
import cn.itheima.utils.CollsionUtils;
import cn.itheima.utils.Config;

import java.util.Random;

public abstract class AbstractTank extends AbstractElement{
    //移动速度
    protected int speed;
    //当前方向：1.上 2.下  3.左  4.右+
    private int direction = 1;
    //敌我标记：1：我方坦克；2：敌方坦克
    private int ourOrEnemyFlag;
    //敌方坦克的最后发射时间
    private long lastTime;

    public AbstractTank(int x, int y, String imgPath,int ourOrEnemyFlag) {
        super(x, y, imgPath);
        this.ourOrEnemyFlag = ourOrEnemyFlag;

    }

    public int getOurOrEnemyFlag() {
        return ourOrEnemyFlag;
    }

    public void setOurOrEnemyFlag(int ourOrEnemyFlag) {
        this.ourOrEnemyFlag = ourOrEnemyFlag;
    }

    //移动
    public void move(){
        switch (direction) {
            case 1://向上移动
                if (this.getY() <= 0 || !canMove()) {//判断是否到达窗口上边
                    if (this.ourOrEnemyFlag == 2) {
                        this.setDirection(-1);//重新生成一个新的方向
                    }
                    return;
                }

                this.setY(this.getY() - speed);

                break;
            case 2://向下移动
                if(this.getY() + this.getHeight() >= Config.WINDOW_HEIGHT
                        || !canMove()){//判断是否到达窗口下边
                    if (this.ourOrEnemyFlag == 2) {
                        this.setDirection(-1);//重新生成一个新的方向
                    }
                    return;
                }

                this.setY(this.getY() + speed);

                break;
            case 3://向左移动
                if (this.getX() <= 0 || !canMove()) {//判断是否到达窗口左边
                    if (this.ourOrEnemyFlag == 2) {
                        this.setDirection(-1);//重新生成一个新的方向
                    }
                    return;
                }

                this.setX(this.getX() - speed);

                break;
            case 4://向右移动
                if(this.getX() + this.getWidth() >= Config.WINDOW_WIDTH
                        || !canMove()){//判断是否到达窗口右边
                    if (this.ourOrEnemyFlag == 2) {
                        this.setDirection(-1);//重新生成一个新的方向
                    }
                    return;
                }

                this.setX(this.getX() + speed);
                break;
        }
    }

    public void setDirection(int drc) {
        if (this.ourOrEnemyFlag == 2) {
            //敌方坦克，要随机产生一个不同的方向
            drc = this.getDirection();
            while (drc == this.getDirection()) {
                drc = new Random().nextInt(4) + 1;
            }
        }
        this.direction = drc;
        switch (drc) {
            case 1://向上
                if(this.ourOrEnemyFlag == 1){
                    this.setImgPath(Config.MY_TANK_UP_IMG_PATH);
                }else{
                    this.setImgPath(Config.ENEMY_TANK_UP_IMG_PATH);
                }
                break;
            case 2://向下
                if (this.ourOrEnemyFlag == 1) {
                    this.setImgPath(Config.MY_TANK_DOWN_IMG_PATH);
                }else{
                    this.setImgPath(Config.ENEMY_TANK_DOWN_IMG_PATH);
                }
                break;
            case 3://向左
                if (this.ourOrEnemyFlag == 1) {
                    this.setImgPath(Config.MY_TANK_LEFT_IMG_PATH);
                }else{
                    this.setImgPath(Config.ENEMY_TANK_LEFT_IMG_PATH);
                }
                break;
            case 4://向右
                if (this.ourOrEnemyFlag == 1) {
                    this.setImgPath(Config.MY_TANK_RIGHT_IMG_PATH);
                }else{
                    this.setImgPath(Config.ENEMY_TANK_RIGHT_IMG_PATH);
                }
                break;
        }
    }
    public int getDirection(){
        return this.direction;
    }

    //判断是否可移动
    protected boolean canMove() {
        for (AbstractElement e : Config.eleList) {
            if (!e.isTankAcross() && getGroup() != e.getGroup() && e != this) {
                int tx1 = this.getX();
                int ty1 = this.getY();
                switch (direction) {
                    case 1:
                        ty1 -= this.speed;
                        break;
                    case 2:
                        ty1 += this.speed;
                        break;
                    case 3:
                        tx1 -= this.speed;
                        break;
                    case 4:
                        tx1 += this.speed;
                        break;
                }
                if(CollsionUtils.isCollsionWithRect(e.getX(),e.getY(),e.getWidth(),e.getHeight(),
                                    tx1,ty1,this.getWidth(),this.getHeight()
                        )){
                    return false;//不能移动
                }
            }
        }
        return true;
    }

    //发射子弹
    public void fire(){
        long time = System.currentTimeMillis();
        long interval;
        if (this.ourOrEnemyFlag == 1) {
            interval = Config.MY_TANK_BULLET_INTERVAL;
        }else{
            interval = Config.ENEMY_TANK_BULLET_INTERVAL;
        }
        if (time - lastTime < interval) {
            return;
        }
        lastTime = time;

        Bullet b = new Bullet(this);
        Config.eleList.add(b);

    }
    @Override
    public boolean isTankAcross() {
        return false;
    }
    public boolean isBulletAcross() {
        return false;
    }
    @Override
    public void draw() {
        super.draw();
        if (this.ourOrEnemyFlag == 2) {//敌方坦克
            //自动开火和移动
            fire();
            this.move();

        }
    }
}
