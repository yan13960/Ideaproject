package com.example.day24.b;

/**
 *
 */
public class text002 {
    public static void main(String args[]) {
        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");
        mb_operate(a, b);
        System.out.println(a + "." + b);
    }
    static void mb_operate(StringBuffer x, StringBuffer y) {
        x.append(y);
        y = x;
    }
}
