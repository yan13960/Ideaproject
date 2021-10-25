package com.example.day09;

/**
 *
 */
public class Text008 {
    public static void main(String[] args) {
        for (int i = 1;i<=9;i++){
            System.out.println("我这第一层"+i);

            for(int j = 1;j<=2;j++){
                System.out.println("我这第二层"+j);
            }
        }
    }
}
