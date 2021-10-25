package com.example.day23;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Text007 {
    public static void main(String[] args) {
        //1.创建狗狗对象
        Dog dog1 = new Dog(1,"dog1");
        Dog dog2 = new Dog(2,"dog2");
        Dog dog3 = new Dog(3,"dog3");
        Dog dog4 = new Dog(4,"dog4");
        //2.创建集合对象
        List<Dog>list=new ArrayList<Dog>();
        //3.第三步
        list.add(dog1);
        list.add(dog2);
        list.add(dog3);
        list.add(dog4);
        //之前是这样写的
       /* for (int i=0;i<list.size();i++){
            Dog dog=list.get(i);
            System.out.println(dog);
        }*/
        //增强循环  foreach 循环  开发都使用这种
       /* for (Dog dog=list){
        }*/
       for (Dog dog:list){
           System.out.println(dog);
       }
    }
}
