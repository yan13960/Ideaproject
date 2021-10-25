package com.example.day09作业;

/**
 *
 */
public class Text001 {
    public static void main(String[] args) {
        System.out.println("乘法口诀表：");
        for (int i = 9; i >= 1; i--) {
            for (int j = 9; j >= i; j--) {
                System.out.print(j + "*" + i+ "=" + j * i + "\t");
            }
            System.out.println(88);
        }
    }

}
