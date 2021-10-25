package com.example.day20;

/**
 * 创建线程的第一种方式
 * 1.继承Thread类
 * 2.重写run方法
 */
public class Thread02 extends Thread {

    @Override
    public void run() {

        System.out.println("子线程名为："+Thread.currentThread().getName());
    }


    public static void main(String[] args) {
        //3.创建线程对象
        Thread02 thread02=new Thread02();
        //4.启动线程 调用start方法
       thread02.start();
        new Thread02().start();
        new Thread02().start();
        new Thread02().start();
        new Thread02().start();
        // 调用run方法试试？不能启动线程，只是普通的方法调用
        thread02.run();
        // 终止线程(代码调用完成，自动终止)
    }
}
