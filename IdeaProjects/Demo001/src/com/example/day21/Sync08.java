package com.example.day21;

/**
 * 异常情况下的锁
 * 碰到异常的情况下，锁会直接释放，不会造成死锁
 */
public class Sync08 {
    int count=0;
    public synchronized void test(){
        System.out.println(Thread.currentThread().getName()+"start");
        while (true){
            count++;
            System.out.println(Thread.currentThread().getName()+"count:"+count);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            if (count==5){
                throw new NullPointerException();
            }
        }
    }

    public static void main(String[] args) {
        Sync08 sync08=new Sync08();
        new Thread(new Runnable() {
            @Override
            public void run() {
                sync08.test();
            }
        },"t1").start();
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        new Thread(new Runnable() {
            @Override
            public void run() {
                sync08.test();
            }
        },"t2").start();
    }
}
