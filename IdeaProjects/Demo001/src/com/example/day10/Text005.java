package com.example.day10;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 *选择排序
 */
public class Text005 {
    public static void main(String[] args) {
        int arr[]={1,3,8,7,6,9,10,11,9,44,11};

        for (int i=0;i<=arr.length-1;i++){
            int maxNumber=arr[i]; //记录当前最大值
            int index=i;//记录当前最大值下标
            for (int j=i+1;j<arr.length;j++){
                if(arr[j]>maxNumber){
                    maxNumber=arr[j];
                    index=j;

                }
            }
            int temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
