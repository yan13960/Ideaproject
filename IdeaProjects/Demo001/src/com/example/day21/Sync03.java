package com.example.day21;

/**
 *
 */
public class Sync03 {
    private int count=10;

    //相当于synchronized(this)
    public synchronized void test(){
        count--;
    }
}
