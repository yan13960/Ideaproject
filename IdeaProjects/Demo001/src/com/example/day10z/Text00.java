package com.example.day10z;

/**
 *
 */
public class Text00 {
    public static void main(String[] args) {
        for (int i=1;i<=9;i++){
            //System.out.println(i);
            for (int j=1;j<=i;j++){//这里每次都是从1开始
                System.out.print(j+"*"+i+"="+(i*j)+"\t");
            }
            System.out.println();
        }
    }
}
