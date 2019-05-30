package com.itheima;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import com.sun.org.apache.regexp.internal.RE;

/**
 * @author wz
 * @create 2019-01-12 19:56
 */
/*自定义一个方法模拟英汉翻译词典；只要给自定义的方法传递指定的英文单词就返回对应的汉字；*/
public class Demo_03 {
    public static void main(String[] args) {
//        String string = "yellow";
//        String color = fanYi(string);
//        System.out.println(string+"对应的汉字为："+color);
        String s = "abcdefABCDEF123$%^&";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                s = s.replace(c, (char) (c - 32));
            } else if (c >= 'A' && c <= 'Z') {
                s = s.replace(c, (char) (c + 32));
            } else if (c >= '1' && c <= '9') {
                s.replace(c, '0');
            } else {
                s.substring(0, i);
            }
        }
        System.out.println(s);
    }

    public static String fanYi(String string) {

        switch (string) {
            case "red":
                return "红色";
            case "yellow":
                return "黄色";
            case "blue":
                return "蓝色";
            case "green":
                return "绿色";
            default:
                return "无法翻译";
        }
    }
}

