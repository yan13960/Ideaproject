package com.example.day16作业.d;

/**
 *
 */
public class Security extends Door implements Lock {
    @Override
    public void openDoor() {
        System.out.println("开门");
    }

    @Override
    public void closeDoor() {
        System.out.println("关门");
    }

    @Override
    public void lookUp() {
        System.out.println("关锁");
    }

    @Override
    public void openLock() {
        System.out.println("开锁");
    }
}
