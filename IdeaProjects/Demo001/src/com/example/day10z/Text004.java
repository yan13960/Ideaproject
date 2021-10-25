package com.example.day10z;

/**
 *
 */
public class Text004 {
    public static void main(String[] args) {
        //创建数组第一种方式
        int[]arr1=new  int[3];
        String str[]=new  String[3];
        str[0]="张三";
//创建数据第二种方式
        int arr2[]={1,2,3,4};
        System.out.println(arr2[0]);
        System.out.println(arr2[3]);
        arr2[0]=100;
        System.out.println(arr2[0]);//100

        String str2[]={"a","b","c"};
            System.out.println(str2[0]);//a
//创建数据第三种方式//这种不可能用，考试写写
            int arr3[]=new int[]{1,2,3};
            System.out.println(arr3[1]);
        }
    }
