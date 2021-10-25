package com.example.day22作业;

/**
 *
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i=0;i<50;i++){
            System.out.println("new");
        }
    }

    public static void main(String[] args) {
        new Thread(new MyRunnable()).start();
        for (int i=0;i<100;i++){
            System.out.println("mian");
        }
    }
}
