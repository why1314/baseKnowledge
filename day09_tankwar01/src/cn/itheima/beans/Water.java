package cn.itheima.beans;

import cn.itheima.element.AbstractElement;

public class Water extends AbstractElement {
    public Water(int x, int y) {

        super(x, y, "res\\img\\water.gif");
    }

    @Override
    public boolean isTankAcross() {
        return false;
    }
}
