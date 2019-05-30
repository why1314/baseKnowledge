package com.itheima.pm.test1;

/**
 * @author wz
 * @create 2019-01-20 14:47
 */
public class Weapon {
    private String name;
    private int isNew;
    private String color;
    private double atttack;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIsNew() {
        return isNew;
    }

    public void setIsNew(int isNew) {
        this.isNew = isNew;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getAtttack() {
        return atttack;
    }

    public void setAtttack(double atttack) {
        this.atttack = atttack;
    }

    public Weapon() {

    }

    public Weapon(String name, int isNew, String color, double atttack) {

        this.name = name;
        this.isNew = isNew;
        this.color = color;
        this.atttack = atttack;
    }
}
