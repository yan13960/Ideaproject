package com.example.day21;

/**
 * 使用同一把锁的情况下，一个同步方法调用另外一个同步方法，能否得到锁？
 * synchronized是支持重入的
 * 也就是使用同一把锁的情况下，一个方法调用另外一个方法，这把锁是可以重复利用的.
 */
public class Sync07 {
    public synchronized void test1(){
        System.out.println("text1 start");
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        test2();
    }

    synchronized void test2() {
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("text2 end");
    }

    public static void main(String[] args) {
        Sync07 sync07=new Sync07();
        sync07.test1();

        Sync07Child sync07Child=new Sync07Child();
        sync07Child.childTest();
    }
}
class Sync07Child extends Sync07{

    public synchronized void test1(){
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
         //test2();
    }
    public synchronized void childTest(){
        System.out.println("childTest start");
        super.test1();
        System.out.println("childTest end");
    }
}
