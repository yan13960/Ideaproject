package com.example.day18.c;

/**
 *
 */
public class Text002 {
    public static void main(String[] args) {
        //这是标准写法，需要new三次
        Door1 door1=new TheftProof3();
        Lock2 lock2=new TheftProof3();
        DoorLmg05 doorLmg05= (DoorLmg05) new TheftProof3();

        //这是不标准写法，一句就可以了
        TheftProof3 theftProof3=new TheftProof3();
    }
}
