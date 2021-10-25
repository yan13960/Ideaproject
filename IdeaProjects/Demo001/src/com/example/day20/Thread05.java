package com.example.day20;

/**
 * 实现Runnable接口来创建线程
 * 1.实现Runnable接口
 * 2.实现run方法
 */
public class Thread05 implements Runnable {
    @Override
    public void run() {
        System.out.println("子线程名为：" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        //3.创建对象
        Thread05 thread05=new Thread05();
        //4.创建线程对象
        Thread t1=new Thread(thread05,"111");
        //Thread t2=new Thread(new Thread05());
        Thread t2=new Thread(thread05);
        Thread t3=new Thread(thread05);

        t1.start();
        t2.start();
        t3.start();
    }
}
