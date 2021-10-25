package com.example.day10z;

/**
 *
 */
public class Text007 {
    public static void main(String[] args) {

    //int nums[] = {5,2};
        /*int temp=nums[0];//把5拿出来了
        nums[0]=nums[1];
        nums[1]=temp;
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+"\t");
        }
    //第一次下标是  ０  １   第二次呢
       /* int nums[] = {2,5,1,9,6};
        for (int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]){//2>5    5>1
                int temp= nums[i-1];//  不能使用０
                nums[i-1]=nums[i];
                nums[i]=temp;
            }
        }*/
    //int nums[] = {2,5,1,9,6};
       /*int nums[] = {1,2,5,6,9};
       for (int end=nums.length-1;end>0;end--){
           for (int i=1;i<end+1;i++){
               if(nums[i-1]>nums[i]){//2>5    5>1
                   int temp= nums[i-1];//  不能使用０
                   nums[i-1]=nums[i];
                   nums[i]=temp;
               }
           }
       }*/

    int nums[] = {1,2,5,6,9};
    //int nums[] = {2,5,1,9,6};
        for (int end=nums.length-1;end>0;end--){
        //假设都是排好的
        boolean flag = true;
        for (int i=1;i<end+1;i++){
            if(nums[i-1]>nums[i]){//2>5    5>1
                int temp= nums[i-1];//  不能使用０
                nums[i-1]=nums[i];
                nums[i]=temp;
                flag=false;//只要有进来就设置为false
            }
        }
        System.out.println("看我循环几次");
        if (flag){
            break;
        }
    }

        for (int i=0;i<nums.length;i++){
        System.out.print(nums[i]+"\t");
    }

}
}

