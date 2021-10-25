package com.example.day10z;

import java.util.Arrays;

/**
 *
 */
public class Text014 {public static void main(String[] args) {

    int nums[] = {9,2};
    System.out.println(Arrays.toString(nums));
    int temp=0;//目前这里赋什么么值无所谓
    if(nums[0]>nums[1]){
        System.out.println("大于");
        temp=nums[0];//将9拿出来
        nums[0]=nums[1];
        nums[1]=temp;
    }

    System.out.println(Arrays.toString(nums));//这个代码不要理，看懂了就好，复制就好，以后开发100%不写
}
}
