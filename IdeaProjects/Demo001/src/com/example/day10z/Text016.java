package com.example.day10z;

import java.util.Arrays;

/**
 *
 */
    public class Text016 {/*public static void main(String[] args) {
        int nums[]={2,9,5,1,6,7,3};
        int temp;
        for (int begin=0; begin<nums.length-1; begin++){//这里循环6次

            for(int j = 0;j<nums.length-begin-1;j++){
                //内循环第一次 6次  第二次5次
                System.out.print(j+":"+(j+1)+"\t");
            }
            System.out.println();
        }
    }*/


    public static void main(String[] args) {
        int nums[]={2,9,5,1,6,7,3};
        int temp=0;
        for (int begin=0; begin<nums.length-1; begin++){//这里循环6次

            for(int j = 0;j<nums.length-begin-1;j++){
                //内循环第一次 6次  第二次5次
                //System.out.print(j+":"+(j+1)+"\t");
                if(nums[j]>nums[j+1]){
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }

        }
        System.out.println(Arrays.toString(nums));
    }
}
