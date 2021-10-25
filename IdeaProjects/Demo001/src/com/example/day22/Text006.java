package com.example.day22;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Text006 {
    public static void main(String[] args) {
        //1.创建狗狗对象
        Dog dog1 = new Dog(1,"dog1");
        Dog dog2 = new Dog(2,"dog2");
        Dog dog3 = new Dog(3,"dog3");
        Dog dog4 = new Dog(4,"dog4");

        //2.创建 ArrayList
        List list = new ArrayList();
        //3.添加值  以后开发过中只会存对象
        list.add(dog1);
        list.add(dog2);
        list.add(dog3);
        list.add(dog4);
        list.add(dog1);
        System.out.println("总共有"+list.size()+"条信息 ");//5
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
