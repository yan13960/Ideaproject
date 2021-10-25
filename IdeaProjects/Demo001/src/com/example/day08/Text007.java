package com.example.day08;

import java.util.Scanner;

/**
 *
 */
public class Text007 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String answer=null;
        System.out.println("张三上午上课");
       /* do {
            System.out.println("写作业，写作业");
            System.out.println("完成了吗？ y/n");
            answer=sc.next();
        }while (!"y".equals(answer));*/
       boolean b;
       do {
           System.out.println("写作业，写作业");
           System.out.println("完成了吗？y/n");
           answer=sc.next();
           if ("y".equals(answer)){
               b=false;
           }else {
               b=true;
           }
       }while (b);
        System.out.println("1111111111");
    }
}
