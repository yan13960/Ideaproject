package com.example.day21;

/**
 * 可见性
 */
public class Volatile01 {
     volatile   boolean running=true;
    public void test(){
        System.out.println("test start");
        while (running){

        }
        System.out.println("test end");
    }

    public static void main(String[] args) {
        Volatile01 volatile01=new Volatile01();
        new Thread(new Runnable() {
            @Override
            public void run() {
                volatile01.test();
            }
        }).start();
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        volatile01.running=false;
        System.out.println("running="+volatile01.running);
    }
}
