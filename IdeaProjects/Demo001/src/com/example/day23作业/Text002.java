package com.example.day23作业;

import com.example.day23作业.Dog;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Text002 {
    public static void main(String[] args) {
        Dog dog1=new Dog("欧欧","雪纳瑞");
        Dog dog2=new Dog("亚亚","拉布拉多");
        Dog dog3=new Dog("菲菲","拉布拉多");
        Dog dog4=new Dog("美美","雪纳瑞");

        List<Dog>list=new ArrayList<Dog>();
        list.add(dog1);
        list.add(dog2);
        list.add(dog3);
        list.add(dog4);
        System.out.println("共计有"+list.size()+"条狗狗");
        System.out.println("分别是：");
        System.out.println(list.get(1));
        for (Dog dog:list){
            System.out.println(dog);
        }
    }
}
