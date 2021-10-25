package com.example.day21;

/**
 *
 */
public class Sync05 implements Runnable {
    private  int count=10;
    @Override
    public  synchronized void run() {
        count--;
        System.out.println(Thread.currentThread().getName()+"count="+count);
    }

    public static void main(String[] args) {
        Sync05 sync05=new Sync05();
        for (int i=0;i<5;i++){
            new Thread(sync05,"Thread"+i).start();
        }
    }
}
