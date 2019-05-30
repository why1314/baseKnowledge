package cn.itheima.element;

import cn.itheima.utils.Config;

public class Blast extends AbstractElement {
    //目标
    private AbstractElement targetEle;

    //爆炸图片
    private String[] boomImg = {"res\\img\\blast_1.gif",
            "res\\img\\blast_2.gif",
            "res\\img\\blast_3.gif",
            "res\\img\\blast_4.gif",
            "res\\img\\blast_5.gif",
            "res\\img\\blast_6.gif",
            "res\\img\\blast_7.gif",
            "res\\img\\blast_8.gif"
    };
    //数组索引
    private int index;
    public Blast(AbstractElement targetEle) {
        super(0, 0, "");
        this.targetEle = targetEle;
        this.setWidth(128);
        this.setHeight(128);

        this.setX(this.targetEle.getX() + ((targetEle.getWidth() - this.getWidth()) / 2));
        this.setY(this.targetEle.getY() + ((targetEle.getHeight() - this.getHeight()) / 2));

        this.setImgPath("res\\img\\blast_1.gif");
    }

    @Override
    public void draw() {
        String img = boomImg[index++];
        this.setImgPath(img);
        if (index >= boomImg.length) {
            Config.eleList.remove(this);
            return;
        }
        super.draw();
    }
}
