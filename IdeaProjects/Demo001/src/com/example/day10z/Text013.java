package com.example.day10z;

/**
 *
 */
public class Text013 {/*public static void main(String[] args) {
        //找出最大值
        int[] arr1={3,7,1,4,10};
        //假设 arr1[0] = 3; 它是最大值
        int maxNum= arr1[0];//3  7  10
        for(int i =1 ;i<arr1.length;i++){
            //System.out.println(arr1[i]);
            if(arr1[i]>maxNum){
                maxNum=arr1[i];
            }
        }
        System.out.println("最大值为"+maxNum);
    }
*/

    public static void main(String[] args) {
        //找出最大值
        int[] arr1={3,7,1,4,10};
        //假设 arr1[0] = 3; 它是最大值
        int maxNum= arr1[0];//3  7  10
        int minNum= arr1[0];
        for(int i =1 ;i<arr1.length;i++){
            //System.out.println(arr1[i]);
            if(arr1[i]<minNum){
                minNum=arr1[i];
            }

            if(arr1[i]>maxNum){
                maxNum=arr1[i];
            }
        }

        System.out.println("最小值为"+minNum);
        System.out.println("最大值为"+maxNum);
    }
}
