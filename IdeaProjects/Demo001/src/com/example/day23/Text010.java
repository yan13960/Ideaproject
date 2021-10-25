package com.example.day23;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 */
public class Text010 {
    public static void main(String[] args) {
        //1.创建狗狗对象
        Dog dog1 = new Dog(1,"dog1");
        Dog dog2 = new Dog(2,"dog2");
        Dog dog3 = new Dog(3,"dog3");
        Dog dog4 = new Dog(4,"dog4");

        //2.创建 HashMap
        Map<String,Dog>maps=new HashMap<String, Dog>();

        //3.把  狗狗对象 存入HashMap 中
        maps.put("dog1",dog1);
        maps.put("dog2",dog2);
        maps.put("dog3",dog3);
        maps.put("dog4",dog4);
        Dog dog=maps.get("dog1");
        System.out.println(dog);
        //4.获取所有的key
        Set<String>keys=maps.keySet();
        System.out.println(keys);
        //5.循环 keys
        for (String key:keys){
            //System.out.println(key);
            //通过key获取值
            Dog dog5=maps.get(key);
            System.out.println(dog5);

        }
    }
}
