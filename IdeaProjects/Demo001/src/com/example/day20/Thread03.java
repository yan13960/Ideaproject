package com.example.day20;

/**
 *
 */
public class Thread03 extends Thread {
    public Thread03(String name) {
        super(name);
    }

    @Override
    public void run() {
        super.run();
        System.out.println("子线程名为：" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread03 thread03=new Thread03("构造方法传入的名字");
        thread03.start();
        new Thread03("AAAAA").start();
    }
}
