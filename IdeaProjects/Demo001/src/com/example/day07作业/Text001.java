package com.example.day07作业;

import java.util.Scanner;

/**
 *
 */
public class Text001 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        if (num>=1&&num<=4){
            switch (num){
                case 1:
                    System.out.println("拨打爸爸的号");
                    break;
                case 2:
                    System.out.println("拨打妈妈的号");
                    break;
                case 3:
                    System.out.println("拨打爷爷的号");
                    break;
                default:
                    System.out.println("拨打奶奶的号");
                    break;
            }
        }else
            System.out.println("谁的都不拨打");
    }
}
