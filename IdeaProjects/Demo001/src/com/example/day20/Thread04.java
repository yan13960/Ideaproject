package com.example.day20;

/**
 *
 */
public class Thread04 extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);
        }

    }

    public static void main(String[] args) {
        new Thread04().start();
        new Thread04().start();
        new  Thread04().start();
        new  Thread04().start();
        new  Thread04().start();
    }
}
