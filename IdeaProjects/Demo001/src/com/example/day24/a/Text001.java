package com.example.day24.a;

import java.util.Scanner;

/**
 *
 */
public class Text001 {
    public static void main(String[] args) {
        int i = 1;
        int j=i++;

        System.out.println(i);
        System.out.println(j);
        Scanner scanner=new Scanner(System.in);
        int k=scanner.nextInt();
        System.out.println(k);

        int x=1;
        int y=2;
        if (x%2==0){
            y++;
        }else {
            y--;
        }
        System.out.println(y);
    }
}

