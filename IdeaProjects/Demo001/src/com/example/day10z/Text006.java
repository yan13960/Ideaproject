package com.example.day10z;

/**
 *
 */
public class Text006 {
    public static void main(String[] args) {
    int arr2[]={100,200,300,400,};
        /*/System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
        System.out.println(arr2[3]);
        System.out.println(arr2[4]);//java.lang.ArrayIndexOutOfBoundsException: 4 数组下标越界*/
        System.out.println(arr2.length);
        /*for (int i=0;i<4;i++){
            System.out.println(i);
            }*/
        for (int i=0;i<4;i++) {
            System.out.println(arr2[i]);
        }
    }
}
