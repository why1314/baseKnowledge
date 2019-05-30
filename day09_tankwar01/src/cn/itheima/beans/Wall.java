package cn.itheima.beans;

import cn.itheima.element.AbstractElement;

public class Wall extends AbstractElement {

    /**
     * 此类构造方法只需要x,y两个参数
     * 而父类构造方法需要三个参数，第三个参数由于是固定的，所以
     * 在这里直接写上图片路径
     * @param x 此砖墙的x坐标点
     * @param y 此砖墙的y坐标点
     */
    public Wall(int x, int y) {
        super(x, y, "res\\img\\wall.gif");
        this.setBlood(3);
    }
    //重写isAcross()方法，设置为：不可穿越
    @Override
    public boolean isTankAcross() {
        return false;
    }
    public boolean isBulletAcross() {
        return false;
    }
}
