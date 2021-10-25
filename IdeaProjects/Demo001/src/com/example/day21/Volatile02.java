package com.example.day21;

import java.util.ArrayList;
import java.util.List;

/**
 * volatile和synchronized
 * volatile只保证可见性，不保证原子性
 * synchronized既保证可见性又保证原子性
 */
public class Volatile02 {
    volatile int count=0;

    public  synchronized void  test(){
        for (int i=0;i<10000;i++){
            count++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Volatile02 volatile02 = new Volatile02();
        //这一段代码理解为  我直接new了十个线程对象  做相同的任务
        List<Thread> threads = new ArrayList<Thread>();
        for (int i = 0; i < 10; i++) {
            threads.add(new Thread(new Runnable() {
                public void run() {
                    volatile02.test();
                }
            }));
        }
        //用循环吧十个线程都启动起来
        for (Thread thread : threads) {
            thread.start();
        }
        //然后等待所有线程执行完毕
        for (Thread thread : threads) {
            //join  等待线程执行完毕
            thread.join();
        }
        //是为了让所有人做完事情之后 再打印
        System.out.println(volatile02.count);
    }
}
