package com.itheima.test04;

/**
 * @author wz
 * @create 2019-01-16 11:18
 */
/*自定义一个方法,判断数组中的元素是否”对称”*/
public class Demo_04 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1};
        System.out.println("打印结果为:" + balance(arr));

    }

    public static String balance(int[] arr) {
//        球场对比次数
        int num = arr.length / 2;

//       循环对比
        for (int i = 0; i < num; i++) {
//            当条件满足不一致时，即可返回false
            if (arr[i] != arr[arr.length - 1 - i]) {
                return "不对称";
            }
        }

        return  "对称";
    }
}
