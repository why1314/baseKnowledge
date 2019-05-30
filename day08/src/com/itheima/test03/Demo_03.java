package com.itheima.test03;

/**
 * @author wz
 * @create 2019-01-16 10:54
 */
/*自定义一个方法,判断两个int类型数组是否”一致”;*/
public class Demo_03 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
        String str = isSame(arr1, arr2) ? "一致" : " 不一致";
        System.out.println("比较效果为:" + str);
    }

    public static boolean isSame(int[] arr1, int[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        } else {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    return false;
                }
            }
        }

        return true;
    }
}
