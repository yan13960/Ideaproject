package com.example.day21;

/**
 *同步方法和非同步方法是否可以同时调用？可以的
 */
public class Sync06 {
    public synchronized void test1(){
        System.out.println(Thread.currentThread().getName()+"test1 start");
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"test1 end");
    }
    public  void  test2(){
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"test2 end");
    }

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                new Sync06().test1();
            }
        },"test1").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                new Sync06().test2();
            }
        },"text2").start();
    }
}
