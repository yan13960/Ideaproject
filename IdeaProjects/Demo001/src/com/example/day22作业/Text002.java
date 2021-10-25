package com.example.day22作业;

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

        List list=new ArrayList();
        list.add(dog1);
        list.add(dog2);
        list.add(dog3);
        list.add(dog4);
        System.out.println("共计有"+list.size()+"条狗狗");
        System.out.println("分别是：");
        System.out.println(list.get(1));
        for (int i=0;i<list.size();i++){
            Dog dog=(Dog)list.get(i);
            System.out.println(list.get(i));
        }
    }
}
