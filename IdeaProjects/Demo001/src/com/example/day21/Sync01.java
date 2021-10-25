package com.example.day21;

/**
 * 线程同步
 * synchronized关键字
 * 通过同步代码块来保证线程安全，使用synchronized实现线程安全的同步代码块
 * 一段同步代码块包含两个部分，一个是作为锁的对象引用，一个是由锁保护的代码块。
 */
public class Sync01 {
    private int count=10;
    private Object object=new Object();
    public  void  test(){
        synchronized (object){
            count--;
        }
    }
}
