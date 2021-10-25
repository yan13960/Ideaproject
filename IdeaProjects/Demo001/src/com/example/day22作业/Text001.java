package com.example.day22作业;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 */
public class Text001 {
    public static void main(String[] args) {
        //1.创建对象
        Penguin penguin1=new Penguin("Q妹",95,100,"女");
        Penguin penguin2=new Penguin("Q仔",90,90,"男");
        Phone phone1=new Phone("苹果",11);
        Phone phone2=new Phone("华为",30);
        Computer computer1=new Computer("联想");
        Computer computer2=new Computer("神舟");
        //2.创建 ArrayList
        List list=new ArrayList();
        //3.添加值
        list.add(penguin1);
        list.add(penguin2);
        list.add(phone1);
        list.add(phone2);
        list.add(computer1);
        list.add(computer2);
        System.out.println("ArrayList集合中的数量为"+list.size());
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("**************************************");

        LinkedList link=new LinkedList();

        link.addFirst(penguin1);
        link.add(penguin2);
        link.add(phone1);
        link.add(phone2);
        link.addLast(computer1);
        link.addLast(computer2);
        System.out.println("LinkedList集合中的数量为"+link.size());
        System.out.println();
        for(int i=0;i<list.size();i++){
            System.out.println(link.get(i));
        }
        penguin1.print();
    }
}
