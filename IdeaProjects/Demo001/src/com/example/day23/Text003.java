package com.example.day23;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Text003 {
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

        //这里会有问题
        list.add("ssssssss");
        for (int i=0;i<list.size();i++){
            /*Exception in thread "main"
            java.lang.ClassCastException: java.lang.String cannot be cast to com.example.day23.Dog
            at com.example.day23.Text003.main(Text003.java:28)*/
            Dog dog=(Dog)list.get(i);
            System.out.println(dog);
        }
    }
}
