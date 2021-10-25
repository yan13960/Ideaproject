package com.example.day23;

import com.example.day22作业.Penguin;

import java.util.LinkedList;
import java.util.List;

/**
 *
 */
public class Text005 {
    public static void main(String[] args) {
        //1.创建狗狗对象
        Dog dog1 = new Dog(1,"dog1");
        Dog dog2 = new Dog(2,"dog2");
        Dog dog3 = new Dog(3,"dog3");
        Dog dog4 = new Dog(4,"dog4");
        Penguin penguin=new Penguin();
        /**
         * 2.创建 ArrayList  解决刚才随便存的问题
         *  集合以后开发，只会存  Dog    Penguin这种对象
         *  使用泛型 <>   <这里确定数据类型>解决此问题以后开发都是这种标准写法
         *   List<Dog> list = new ArrayList<Dog>(); 这是标准写法
         *   List<Dog> list = new ArrayList(); 这也可以， 最好不要这样写
         *   List<Dog> list = new ArrayList<>(); 这也可以， 最好不要这样写
         */
        /**
         * 不会用的
         *  List<Integer> list = new ArrayList<Integer>();
         *  List<String> list = new ArrayList<String>();
         */
        List<Dog>list=new LinkedList<Dog>();
        //3.添加值  以后开发过中只会存对象
        list.add(dog1);
        list.add(dog2);
        list.add(dog3);
        list.add(dog4);
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
            Dog dog=list.get(i);
            System.out.println(dog);
            Object o=list.get(i);
            System.out.println(o);
        }
    }
}
