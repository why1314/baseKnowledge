package com.itheima.pm.test1;

/**
 * @author wz
 * @create 2019-01-20 14:46
 */
public class Soldier {
    private int age;
    private String name;
    private int level;
    private int hp;
    private Weapon wp;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Weapon getWp() {
        return wp;
    }

    public void setWp(Weapon wp) {
        this.wp = wp;
    }

    public Soldier() {

    }

    public Soldier(int age, String name, int level, int hp, Weapon wp) {

        this.age = age;
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.wp = wp;
    }

    public void kanRen(){
        System.out.println(getName()+"拿着"+wp.getColor()+"的"+wp.getName()+"砍向敌人！！！！！！");
    }
}
