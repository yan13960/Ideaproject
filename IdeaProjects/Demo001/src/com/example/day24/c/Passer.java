package com.example.day24.c;

/**
 *
 */
 class Passerf {
    static  int x = 5;

    public static void main(String[] args) {
        new Passerf().go(x);
        // 打印的是成员变量x
        System.out.print(x);
    }

    void go(int x) {
        // 打印的是值传递过来的x
        System.out.print(x++);
    }
}

