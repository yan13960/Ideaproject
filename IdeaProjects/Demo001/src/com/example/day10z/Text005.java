package com.example.day10z;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 */
public class Text005 {
    public static void main(String[] args) {
        int nums[]={2,5,1,9,6};//定义数组
        System.out.println("没有排序之前");
        for (int i=0;i<nums.length;i++){
            System.out.print(nums[i]+"\t");
        }
        //排序
        Arrays.sort(nums);
        System.out.println("排序后的");
        for (int i=0;i<nums.length;i++){
            System.out.print(nums[i]+"\t");
        }
    }
}
