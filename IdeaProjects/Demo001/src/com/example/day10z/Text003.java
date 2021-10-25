package com.example.day10z;

/**
 *
 */
public class Text003 {
    //找出最大值  或最小值
    public static void main(String[] args) {

        int nums[]   = {1,3,69,54,27};
        //假如 0最大的
        int maxNum=nums[0];
        int minNum=nums[0];
        //循环遍历
        for(int i =0;i<nums.length-1;i++){
             //System.out.println(nums[i]);
            //判断
            //第一次 最大值变为3   第二次变为69
            if(nums[i]>maxNum){ //3 >1     69>3   54>69     27>69
                maxNum=nums[i];
            }

            if(nums[i]<minNum){
                minNum=nums[i];
            }
        }
        System.out.println("最大值为"+maxNum);
        System.out.println("最小值为"+minNum);


    }
}