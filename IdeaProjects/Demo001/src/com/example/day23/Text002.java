package com.example.day23;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Text002 {
    public static void main(String[] args) {
        //1.创建狗狗对象
        Dog dog1 = new Dog(1,"dog1");
        Dog dog2 = new Dog(2,"dog2");
        Dog dog3 = new Dog(3,"dog3");
        Dog dog4 = new Dog(4,"dog4");

        //2.创建 ArrayList
        List list=new ArrayList();

        //3.添加值  以后开发过中只会存对象
        list.add(dog1);
        list.add(dog2);
        list.add(dog3);
        list.add(dog4);
        //System.out.println(list.get(0));
        Dog dog=(Dog)list.get(0);
        System.out.println(dog);
    }
}
