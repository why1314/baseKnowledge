package com.itheima;

import java.util.Scanner;

/**
 * @author wz
 * @create 2019-01-18 20:28
 */
/*求一个字符串 是否是 "等括号"字符串
        等括号的含义  []{{{}}{<()>
        1).必须成对出现 有开始有结束  "()" "[]"
        2).允许括号嵌套  "([])"  "[{}([])]"
        3).但是不允许单独嵌套  "{(})" "({[}])"
        4).字符串中只有一共四种括号 () [] {} <>
        题目: 要用户输入一个只包含这四种括号的字符串,我们判断该字符串是否是"等括号"字符串
*/
public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String next = sc.next();
        int da = 0;
        int zhong = 0;
        int xiao = 0;
        int jian = 0;
        for (int i = 0; i < next.length(); i++) {
            if ('{' == next.charAt(i)) {
                da += 1;
            }
            if ('[' == next.charAt(i)) {
                zhong += 1;
            }
            if ('(' == next.charAt(i)) {
                xiao += 1;
            }
            if ('<' == next.charAt(i)) {
                jian += 1;
            }
            if ('}' == next.charAt(i)) {
                da -= 1;
            }
            if (']' == next.charAt(i)) {
                zhong -= 1;
            }
            if (')' == next.charAt(i)) {
                xiao -= 1;
            }
            if ('>' == next.charAt(i)) {
                jian -= 1;
            }
            if (da < 0 || zhong < 0 || xiao < 0 || jian < 0) {
                break;
            }
        }
        if (da != 0 || xiao != 0 || zhong != 0 || jian != 0) {
            System.out.println("error");
        } else {
            System.out.println("ok");
        }
    }
}
