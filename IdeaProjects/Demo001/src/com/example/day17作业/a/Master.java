package com.example.day17作业.a;

/**
 *
 */
public class Master implements Lock {
    @Override
    public void lookUp() {
        System.out.println("关锁");
    }

    @Override
    public void openLock() {
        System.out.println("开锁");
    }
}
