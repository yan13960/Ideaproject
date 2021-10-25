package com.example.day08作业;

/**
 *
 */
public class Text009 {
    public static void main(String[] args) {
        int sum=0;
        for (int i=1;i<10;i++){
            if (i%2==1){
                continue;
            }sum=sum+i;
        }
        System.out.println(sum);
    }
}
