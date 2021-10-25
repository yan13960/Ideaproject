package com.example.day18.a;

/**
 *
 */
public class TheftProof3 extends Door1 implements Lock2 {
    /**
     * 开门
     */
    @Override
    public void openDoor() {
        System.out.println("轻轻的一推  门开了。。。。");
    }

    /**
     * 关门
     */
    @Override
    public void closeDoor() {
        System.out.println("轻轻的一拉  门关了。。。。");
    }

    /**
     * 开锁
     */
    @Override
    public void openLock() {
        System.out.println("插入钥匙 ，往右扭三圈 开锁了 ");
    }

    /**
     * 上锁
     */
    @Override
    public void closeLock() {
        System.out.println("插入钥匙 ，往左扭三圈 上锁了 ");
    }
}
