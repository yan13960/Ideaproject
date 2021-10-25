package com.example.day18.c;

/**
 *
 */
public class TheftProof3 extends Door1 implements Lock2 {
    /**
     * 开门
     *
     * @param typeId
     */
    @Override
    public void openDoor(int typeId) {
        if (typeId == 1) {

        }else {

        }
        System.out.println("轻轻的一推  门开了。。。。");
    }

    /**
     * 关门
     *
     * @param typeId
     */
    @Override
    public void closeDoor(int typeId) {
       if (typeId==1){

       }else {

       }
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
    /**
     * 拍照存档
     * false 代表是坏人
     * true 代表是好人
     */
    public boolean takePhoto(){
        boolean b=true;
        System.out.println("拍照存档，系统分析行到结果");
        //真实开发，这里会有一系列业务逻辑代码，处理后最终得到 boolean
        return b;
    }
}
