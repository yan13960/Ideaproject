package com.example.day24.d;

/**
 *
 */
public class Text001 {
    public static void main(String[] args) {
        double i = 3 / 5;
        System.out.println(i);

            boolean x = true;
            boolean y = false;
            short z = 42;
            // true && true; y被赋值为true; 执行完方法体后z的值为44
            if ((z++ == 42) && (y = true)) z++;
            // false || true; z的值为46
            if ((x = false) || (++z == 45)) z++;
            System.out.println("z=" + z);
            String S1="ABC"+"DEF";
        System.out.println(S1);
        String S2=new String(S1);
        }
    }
