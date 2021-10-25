package com.example.day22作业;

import java.util.Random;

/**
 *
 */
public class Text004 {
    public static void main(String[] args) {
        Random random=new Random();
        int[] num=new int[5];
        for (int i=0;i<num.length;i++){
            num[i]=20+random.nextInt(31);
            System.out.println(num[i]);
        }
    }
}
