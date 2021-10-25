package com.example.day21;

/**
 *
 */
public class Sync02 {
    private int count=10;

    public  void test(){
        synchronized (this){
            count--;
        }
    }
}
