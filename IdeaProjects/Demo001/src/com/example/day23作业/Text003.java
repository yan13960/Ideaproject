package com.example.day23作业;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 */
public class Text003 {
    public static void main(String[] args) {
        Dog dog1=new Dog("欧欧","雪纳瑞");
        Dog dog2=new Dog("亚亚","拉布拉多");
        Dog dog3=new Dog("菲菲","拉布拉多");
        Dog dog4=new Dog("美美","雪纳瑞");

        Map<String,Dog>maps=new HashMap<String, Dog>();
        maps.put("111",dog1);
        maps.put("222",dog2);
        maps.put("333",dog3);
        maps.put("444",dog4);
        Dog dog=maps.get("111");
        System.out.println(dog);

        System.out.println("共计有"+maps.size()+"条狗狗");
        System.out.println("分别是：");
        //System.out.println(maps.get("111"));
        //4.获取所有的key
        //System.out.println(maps.keySet());
        Set<String>keys=maps.keySet();
        //System.out.println(keys);
        //5.循环 keys
        for (String string:keys){
            //System.out.println(string);
           /* Dog dog5=maps.get(string);
            System.out.println(dog5);*/
            System.out.println(maps.get(string));
        }
    }
}
