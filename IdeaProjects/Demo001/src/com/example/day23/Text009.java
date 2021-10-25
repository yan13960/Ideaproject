package com.example.day23;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Text009 {
    //开发100%不会这亲写，我是讲思路
    public static void main(String[] args) {
        //1.创建狗狗对象
        Dog dog1 = new Dog(1,"dog1");
        Dog dog2 = new Dog(2,"dog2");
        Dog dog3 = new Dog(3,"dog3");
        Dog dog4 = new Dog(4,"dog4");
        //2.创建集合对象
        List list = new ArrayList<>();
        //3.第三步
        list.add(dog1);
        list.add(dog2);
        list.add(dog3);
        list.add(dog4);
        //增强循环  foreach 循环  开发都使用这种
        for (Object obj:list) {
            //System.out.println(obj);
            Dog dog=(Dog)obj;
            System.out.println(dog);
        }
    }
}
