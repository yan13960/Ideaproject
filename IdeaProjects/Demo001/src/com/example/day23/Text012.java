package com.example.day23;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 */
public class Text012 {
    public static void main(String[] args) {
        /**
         * 迭代器，100%不用，就是讲一下思路，对后面课程有帮助   主要了解while（这个代码）
         */
        //1.创建狗狗对象
        Dog dog1 = new Dog(1,"dog1");
        Dog dog2 = new Dog(2,"dog2");
        Dog dog3 = new Dog(3,"dog3");
        Dog dog4 = new Dog(4,"dog4");

        //2.创建 HashMap
        Map<String,Dog>maps=new HashMap<>();

        //3.把  狗狗对象 存入HashMap 中
        maps.put("dog1",dog1);
        maps.put("dog2",dog2);
        maps.put("dog3",dog3);
        maps.put("dog4",dog4);

        //获取所有值，不用
        //System.out.println(maps.values());
        ////4.获取所有key
        Set keys=maps.keySet();
        //5.把keys存入   Iterator对象中
        Iterator sbq=keys.iterator();
        //sbq.hasNext() 就是问Iterator这里面有没有值，有值返回 true
        while (sbq.hasNext()){
            //sbq.next();//一次拿一个
            //sbq.hasNext();
            sbq.next();
            String key=(String)sbq.next();
            System.out.println(key);
            System.out.println(maps.get(key));
        }
        for (Object key2:keys){
            //System.out.println(key2);
            //通过key获取值
            Dog dog5=maps.get(key2);
            System.out.println(dog5);
        }
    }
}
