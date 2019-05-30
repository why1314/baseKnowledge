package cn.itheima.element;

import cn.itheima.utils.Config;
import cn.itheima.utils.DrawUtils;

import java.io.IOException;

public abstract class AbstractElement {
    private int x;//x坐标点
    private int y;//y坐标点
    private int width;//宽度
    private int height;//高度
    private String imgPath;//元素图片路径
    private int blood;//血量
    //坦克分组：0：主坦克；1：敌方坦克 2:其它元素
    private int group = 2;

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public AbstractElement(int x, int y,String imgPath) {
        this.x = x;
        this.y = y;
        this.imgPath = imgPath;
        this.width = Config.WALL_WIDTH;
        this.height = Config.WALL_HEIGHT;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }
    //在窗体上绘制此元素
    public void draw(){
        try {
            DrawUtils.draw(imgPath,this.x,this.y);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //是否可穿越
    public boolean isTankAcross(){
        return true;
    }
    public boolean isBulletAcross(){
        return true;
    }
}
