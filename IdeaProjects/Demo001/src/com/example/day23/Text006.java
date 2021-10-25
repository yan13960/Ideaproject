package com.example.day23;

import java.util.HashMap;
import java.util.Map;

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
        /**
         *  HashMap 存的是键值对
         *  map.put("这里一般就存String类型","这里存对象，或String类型 int");
         *   Map<> map = new HashMap<>();
         *   <String,Dog>/**/
        Map<String,Dog>map=new HashMap<String, Dog>();
        map.put("dog1",dog1);
        map.put("dog2",dog2);
        map.put("dog3",dog3);
        map.put("dog4",dog4);

        Dog dog=map.get("dog1");
        System.out.println(dog);
        //输出狗狗数量
        System.out.println(map.size());
        //删除也是一样的 ,不可能去删除
        map.remove("dog1");
        //循环遍历的等会讲，暂时先不讲
    }
}

