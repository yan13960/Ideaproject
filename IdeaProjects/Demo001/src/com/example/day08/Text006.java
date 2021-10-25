package com.example.day08;

/**
 *
 */
public class Text006 {
    public static void main(String[] args) {
        //这个代码开发100%不写，面试的
        do {
            System.out.println("一上来就执行一次1，我不管while（false）是否成立，我都执行");
        }while (false);
        //老师为什么这个要这样写，这是规定的法
        /*do {
            System.out.println("死循环");
        }while (true);*/

        /*boolean b;
        b=true;
        do {
            System.out.println("一上来就执行一次1，我不管 while (false) 是否成立，我都执行");
        }while (!b);*/

        boolean b;
        do {
            System.out.println("一上来就执行一次1，我不管 while (false) 是否成立，我都执行");
            b=false;
        }while (!b);//死循环， 加了!  因为b  为false 结果为true
    }
}
