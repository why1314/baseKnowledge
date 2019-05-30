package com.itheima.test01;

/**
 * @author wz
 * @create 2019-01-16 10:28
 */
/*求指定int类型数组平均值,
数组元素为:  1,2,3,4,5
打印效果为:
数组的平均值为:3.0
*/
public class Demo_01 {
    public static void main(String[] args) {
//        定义int类型数组
        int[] arr = new int[]{1, 2, 3, 4, 5};
//        循环遍历求和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
//        求平均值
        double avg = (double)sum / arr.length;
        System.out.println("数组的平均值为:" + avg);
    }


}
