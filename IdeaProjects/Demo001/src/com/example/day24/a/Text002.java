package com.example.day24.a;

/**
 *
 */
public class Text002 {
    static int a=5;
    public static void main(String[] args) {

        int x = 4;
        int y = 5;
        if (x++ > 4 & ++y > 5) {
            x++;
        }else {
            System.out.println("x=" + x + ",y=" + y);
        }
        System.out.println(Text002.a);
        Text002 text002=new Text002();
        System.out.println(text002.a);

    }

}
