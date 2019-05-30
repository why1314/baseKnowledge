package cn.itheima.utils;

import cn.itheima.element.AbstractElement;

import java.util.ArrayList;

public class Config {
    //存储窗体中所有元素的集合
    public static  ArrayList<AbstractElement> eleList = new ArrayList<>();
    //游戏主窗体的宽度
    public static int WINDOW_HEIGHT = 64 * 9;
    //游戏主窗体的高度
    public static int WINDOW_WIDTH = 64 * 15;
    //窗体刷新频率--每秒50次
    public static int WINDOW_FPS = 50;

    public static int WALL_WIDTH = 64;
    public static int WALL_HEIGHT = 64;

    //************我方坦克相关配置************//
    //上、下、左、右方向图片
    public static String MY_TANK_UP_IMG_PATH = "res\\img\\tank_u.gif";
    public static String MY_TANK_DOWN_IMG_PATH = "res\\img\\tank_d.gif";
    public static String MY_TANK_LEFT_IMG_PATH = "res\\img\\tank_l.gif";
    public static String MY_TANK_RIGHT_IMG_PATH = "res\\img\\tank_r.gif";
    //移动速度
    public static int MY_TANK_SPEED = 32;
    //子弹发射间隔：毫秒
    public static long MY_TANK_BULLET_INTERVAL = 200;
    //血量：
    public static int MY_TANK_BLOOD = 500;

    //*************敌方坦克相关配置************//
    public static String ENEMY_TANK_UP_IMG_PATH = "res\\img\\enemy_1_u.gif";
    public static String ENEMY_TANK_DOWN_IMG_PATH = "res\\img\\enemy_1_d.gif";
    public static String ENEMY_TANK_LEFT_IMG_PATH = "res\\img\\enemy_1_l.gif";
    public static String ENEMY_TANK_RIGHT_IMG_PATH = "res\\img\\enemy_1_r.gif";
    //移动速度
    public static int ENEMY_TANK_SPEED = 4;//由于是自动移动，所以要设置小一些
    //子弹发射间隔：毫秒
    public static long ENEMY_TANK_BULLET_INTERVAL = 800;
    //血量：
    public static int ENEMY_TANK_BLOOD = 3;


    //各种墙图片路径
    public static String WALL_IMG_PATH = "res\\img\\wall.gif";
    public static int WALL_BLOOD = 3;//砖墙血量
    public static String WATER_IMG_PATH = "res\\img\\water.gif";

    public static String STEEL_IMG_PATH = "res\\img\\steel.gif";
    public static int STEEL_BLOOD = 5;//铁墙血量

    public static String GRASS_IMG_PATH = "res\\img\\grass.gif";

    //子弹图片路径
    public static String My_BULLET_UP_IMG_PATH = "res\\img\\shot_top.gif";
    public static String My_BULLET_DOWN_IMG_PATH = "res\\img\\shot_bottom.gif";
    public static String My_BULLET_LEFT_IMG_PATH = "res\\img\\shot_left.gif";
    public static String My_BULLET_RIGHT_IMG_PATH = "res\\img\\shot_right.gif";


    //声音文件路径
    public static String SND_START = "res\\snd\\start.wav";
    public static String SND_FIRE = "res\\snd\\fire.wav";
    public static String SND_HIT = "res\\snd\\hit.wav";
    public static String SND_BLAST = "res\\snd\\blast.wav";
    public static String SND_OVER = "res\\snd\\over.wav";




}
