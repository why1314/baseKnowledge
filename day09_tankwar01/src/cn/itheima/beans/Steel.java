package cn.itheima.beans;

import cn.itheima.element.AbstractElement;

public class Steel extends AbstractElement {

    public Steel(int x, int y) {
        super(x, y, "res\\img\\steel.gif");
        this.setBlood(5);
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
