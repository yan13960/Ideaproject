package com.example.day10z;

import java.util.Arrays;

/**
 *
 */
public class Text015 {

    public static void main(String[] args) {
        //第一次循环，把最大值放在最后面
        int nums[]={2,9,5,1,6,7,3};

        for (int begin=1; begin < nums.length; begin++){
            //第一次的时候  2>9    nums[begin-1] 0        nums[begin] 1
            if(nums[begin-1]>nums[begin]){
                int temp =  nums[begin-1];
                nums[begin-1]=nums[begin];
                nums[begin]=temp;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}
