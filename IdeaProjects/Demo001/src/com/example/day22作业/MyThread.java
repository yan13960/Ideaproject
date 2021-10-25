package com.example.day22作业;

/**
 *
 */
public class MyThread extends Thread{
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        super.run();
        System.out.println(this.getName());
    }

    public static void main(String[] args) {
        new MyThread("Thread1").start();
        new MyThread("Thread2").start();
    }
}
