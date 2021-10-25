package com.example.day10;

/**
 *求最大值最小值
 */
public class Text002 {
    public static void main(String[] args) {
        int arr[]={1,4,3,2,3,6,7};
        int max=arr[0];
        int min=arr[0];
        for (int i=0;i<=arr.length-1;i++){
            if (max<arr[i]){
                max=arr[i];
            }
            if (min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("最大值为："+max);
        System.out.println("最小值为："+min);
    }
}
