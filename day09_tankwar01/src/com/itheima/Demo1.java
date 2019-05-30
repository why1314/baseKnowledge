package homework1;

import java.util.ArrayList;
import java.util.Scanner;

////1.求一个字符串 是否是 "等括号"字符串
//        //等括号的含义
//        //1).必须成对出现 有开始有结束  "()" "[]"
//        //2).允许括号嵌套  "([])"  "[{}([])]"
//        //3).但是不允许单独嵌套  "{(})" "({[}])"
//        //4).字符串中只有一共四种括号 () [] {} <>
//        //题目: 要用户输入一个只包含这四种括号的字符串,我们判断该字符串是否是"等括号"字符串
public class Demo1 {
    public static void main(String[] args) {
        istrue();
    }

    public static void istrue() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入要判断的字符串。");
            String str = sc.next();

            ArrayList<Character> al = new ArrayList<Character>();
            char[] ch = str.toCharArray();

            for (int i = 0; i < ch.length; i++) {//向集合添加元素
                if (ch[i] == '(') {
                    al.add('(');
                } else if (ch[i] == '{') {
                    al.add('{');
                } else if (ch[i] == '[') {
                    al.add('[');
                } else if (ch[i] == '<') {
                    al.add('<');
                }

                if (ch[i] == ')') {
                    if (al.size() == 0) {//如果是空集合，直接判断不匹配
                        System.out.println("不匹配");
                        return;
                    }
                    if ((al.get(al.size() - 1)) != '(') {//判断最后一个元素是否匹配
                        System.out.println("不匹配");
                        return;
                    }
                    al.remove(al.size() - 1);
                }

                if (ch[i] == '}') {
                    if (al.size() == 0) {
                        System.out.println("不匹配");
                        return;
                    }
                    if ((al.get(al.size() - 1)) != '{') {
                        System.out.println("bupipei");
                        return;
                    }
                    al.remove(al.size() - 1);
                }

                if (ch[i] == ']') {
                    if (al.size() == 0) {
                        System.out.println("不匹配");
                        return;
                    }
                    if ((al.get(al.size() - 1)) != '[') {
                        System.out.println("bupipei");
                        return;
                    }
                    al.remove(al.size() - 1);
                }

                if (ch[i] == '>') {
                    if (al.size() == 0) {
                        System.out.println("不匹配");
                        return;
                    }
                    if ((al.get(al.size() - 1)) != '<') {
                        System.out.println("bupipei");
                        return;
                    }
                    al.remove(al.size() - 1);
                }


            }

            if (al.size() == 0) {
                System.out.println("该字符串符合等括号字符串。。。。。");
            } else {
                System.out.println("bupipei");
            }
        }
    }
}
