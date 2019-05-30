package com.itheima;

/**
 * @author wz
 * @create 2019-01-09 14:50
 */
//数组反转
public class ArrayDemo_02 {
    public static void main(String[] args) {
//        1、声明一个整型数组
        int[] nums={1,2,13,13,13,14,141,345,4,66,76,8,79,0,4};
//        设置指针
//        int left=0;
//        int right=nums.length-1;
//
////        交换数据
//        while (left<right){
//            int temp=nums[left];
//            nums[left]=nums[right];
//            nums[right]=temp;
//
//            left++;
//            right--;
//        }
//          求得循环次数
        int number=nums.length/2;

        for (int i = 0; i < number; i++) {

            int temp=nums[i];
            nums[i]=nums[nums.length-1-i];
            nums[nums.length-1-i]=temp;
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

    }
}
