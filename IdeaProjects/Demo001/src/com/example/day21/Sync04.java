package com.example.day21;

/**
 *
 */
public class Sync04 {
    private static int count=10;

    //用于静态方法时，锁住的是class
    public synchronized static void test(){
        count--;
    }
    public static void test02(){
        //能否替换成synchronized(this)? 不能
        synchronized (Sync04.class){
            count--;
        }
    }

    public static void main(String[] args) {
        Class<Sync04>sync04Class=Sync04.class;
        Sync04.test02();
    }
}
