package com.example.day09作业;

import java.util.Scanner;

/**
 *
 */
public class Text004 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num =input.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print("!");
            }
            for (int z = 1; z <= 2 * i - 1; z++) {
                System.out.print("@");
            }
            System.out.println();
        }
        for (int i = num-1; i >= 1; i--) {
                for (int j = 1; j <= num- i; j++) {
                    System.out.print("!");
                }
                for (int z = 1; z <= 2 * i - 1; z++) {
                    System.out.print("@");
                }
                System.out.println();
            }
        }

    }