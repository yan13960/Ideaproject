package com.example.day10z;

import java.util.Arrays;

/**
 *
 */
public class Text017 {/*public static void main(String[] args) {
        //这个是思路问题，大家下课 通过debug去调
        //自己写的代码，一定通过debug调试，理解
        int nums[]={1, 2, 3, 5, 6, 7, 9};
        int temp=0;
        boolean flag;
        for (int begin=0; begin<nums.length-1; begin++){//这里循环6次
            //假设都是设排好的
             flag = true;
            for(int j = 0;j<nums.length-begin-1;j++){
                //内循环第一次 6次  第二次5次
                //System.out.print(j+":"+(j+1)+"\t");
                if(nums[j]>nums[j+1]){
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    //只要进来了就是代码有没排好的，
                    flag=false;
                }
            }
            if(flag){
                break;
            }
            System.out.println("循环");
        }

        System.out.println(Arrays.toString(nums));
    }*/


    public static void main(String[] args) {
        //这个是思路问题，大家下课 通过debug去调
        //自己写的代码，一定通过debug调试，理解
        int nums[]={1, 2, 3, 5, 6, 7, 9};
        int temp=0;
        boolean flag2=false;
        for (int begin=0; begin<nums.length-1; begin++){//这里循环6次
            if(flag2){
                break;
            }System.out.println("循环");
            //假设都是设排好的
            boolean flag = true;
            for(int j = 0;j<nums.length-begin-1;j++){
                //内循环第一次 6次  第二次5次
                //System.out.print(j+":"+(j+1)+"\t");
                if(nums[j]>nums[j+1]){
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    //只要进来了就是代码有没排好的，
                    flag=false;
                }
            }
            if(flag){
                flag2=true;
                break;
            }

        }

        System.out.println(Arrays.toString(nums));
    }
}
