package com.example.day18.b;

/**
 * describe  防盗门
 *   防盗门  由  锁 +门 组成的
 * 作者：曾昭武  adam8831
 */
public class TheftProof3 extends Door1 implements Lock2{
    /**
     * 开门
     *
     * @param typeId
     */
    @Override
    public void openDoor(int typeId) {
        if (typeId==1){

        }else {

        }
        System.out.println("轻轻的一推  门开了。。。。");
    }

    /**
     * 关门
     *
     * @param typeid
     */
    @Override
    public void closeDoor(int typeid) {
if (typeid==1){

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
    public void closeLook() {
        System.out.println("插入钥匙 ，往左扭三圈 上锁了 ");
    }
}
