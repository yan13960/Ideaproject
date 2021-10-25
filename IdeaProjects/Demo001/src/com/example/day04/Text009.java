package com.example.day04;

/**
 *
 */
public class Text009 {
    public static void main(String[] args) {
        int  num=100;
        int num2=100;
        boolean b = num==num2;//  boolean 只能赋值为  true false
        System.out.println(b);//true

        boolean b1 = num!=num2;//  本来结为true 加了！取反   false
        System.out.println(b1);//


        System.out.println("再次强调，必需把这个 boolean 搞懂    还有这个 !   ");
        System.out.println(!"aa".equals("aa"));//false

        boolean b2 = !"aa".equals("aa");
        System.out.println(b2);


    }
}
