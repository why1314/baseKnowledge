package com.itheima;

/**
 * @author wz
 * @create 2019-01-09 9:28
 */
public class ArrayDemo_01 {
    public static void main(String[] args) {
        int[] ageArray = {23,123,43,13,1,32,132,1,23,1,32,23,123,1,13};
        int max=ageArray[0];
        int min=ageArray[0];
        for (int i = 1; i < ageArray.length; i++) {
            if (max<ageArray[i]){
                max=ageArray[i];
            }
            if (min>ageArray[i]){
                min=ageArray[i];
            }

        }
        System.out.println(max);
        System.out.println(min);

    }
}
