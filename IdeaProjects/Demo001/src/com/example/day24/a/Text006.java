package com.example.day24.a;

/**
 *
 */
public class Text006 {
    static void aaa(int i){
        i=i+99;
        System.out.println(i);
    }


    public static void main(String[] args) {
        int i=100;

       aaa(100);
       System.out.println(i+100);
    }
}
