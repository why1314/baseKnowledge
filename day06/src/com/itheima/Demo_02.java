package com.itheima;

/**
 * @author wz
 * @create 2019-01-12 19:39
 */
/*自定义一个方法完成将指定数字转成对应字符并返回的方法；
具体要求：如果指定数字对应的是数字字符或英文字符可以直接转换，其他字符返回空格，并提示以空格替换；
*/
public class Demo_02 {
    public static void main(String[] args) {
        int i=113;
        char c = transNumberToChar(i);
        System.out.println(i+"转换后的字符为："+c);
    }

    public static char transNumberToChar(int i) {
        char ch = (char) i;
        if (ch >= 'a' && ch >= 'z' || ch >= 'A' && ch >= 'Z' || ch >= '0' && ch <= '9'){
            return ch;
        }else {
            System.out.println("不是数字字符，也不是字母字符，用空格代替");
            return ' ';
        }
    }
}
