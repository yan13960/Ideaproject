package com.example.day12.b;

/**
 *
 */
public class Penguin {
    //昵称
    public String name="昵称1";
    public int love=100;
    public String sex="Q妹";
    public String strain;
    public  void print(){
        System.out.println("宠物的自白：\n 我的名字叫\t"+name+"与主人亲密度为\t" +
                ""+love+"品种为"+strain);
    }

   /* public static void main(String[] args) {
        Penguin penguin= new Penguin();
        System.out.println(penguin.name);
    }*/
}
