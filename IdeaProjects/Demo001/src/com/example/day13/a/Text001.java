package com.example.day13.a;

/**
 *
 */
public class Text001 {
   public static void main(String[] args) {
        Dog dog=new Dog("值1","品种2",100,'s');
        dog.name="dd2";
        //请问这个值是多少?
        System.out.println(dog.name);
    }

   /* public static void main(String[] args) {
        Dog dog=new Dog("aaa1","bbb2");
        System.out.println(dog.name);
        System.out.println(dog.strain);
    }*/
  /* public static void main(String[] args) {
       Dog dog=new Dog("aaa1","品种2",100,'3');
   }*/
  /* public static void main(String[] args) {
       Dog dog=new Dog("aaa1","品种2",100,'3');
       System.out.println("我的名字是："+dog.name);
   }*/
}

