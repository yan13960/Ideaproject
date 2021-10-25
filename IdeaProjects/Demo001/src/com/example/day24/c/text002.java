package com.example.day24.c;

/**
 *
 */
public class text002 {
   public int count=9;
    public void count1(){
        count=10;
        System.out.println("count1="+count);
    }
    public void count2(){

        System.out.println("count2="+count);
    }
    public void count3(){

        System.out.println("count3="+this.count);
    }


    public static void main(String[] args) {
        text002 t=new text002();
        t.count1();
        t.count2();
        t.count3();
        System.out.println(t.count);
    }
}
