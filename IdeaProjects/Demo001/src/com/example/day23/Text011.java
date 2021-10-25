package com.example.day23;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 */
public class Text011 {
    public static void main(String[] args) {
        //1.创建狗狗对象
        Dog dog1 = new Dog(1,"dog1");
        Dog dog2 = new Dog(2,"dog2");
        Dog dog3 = new Dog(3,"dog3");
        Dog dog4 = new Dog(4,"dog4");

        //2.创建 HashMap
        Map maps=new HashMap();
        //3.把  狗狗对象 存入HashMap 中
        maps.put("dog1",dog1);
        maps.put("dog2",dog2);
        maps.put("dog3",dog3);
        maps.put("dog4",dog4);
        maps.put(1,"ddd");
        //4.获取有的key
        Set keys=maps.keySet();
        //System.out.println(keys);
        for (Object object:keys){
            //System.out.println(object);
            System.out.println(maps.get(object));
           // Dog dog= (Dog) maps.get(object);
            //System.out.println(dog);
        }
    }
}
