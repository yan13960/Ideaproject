package com.example.day22;

import java.util.LinkedList;

/**
 *
 */
public class Text004 { public static void main(String[] args) {
    //1.创建狗狗对象
    Dog dog1 = new Dog(1,"dog1");
    Dog dog2 = new Dog(2,"dog2");
    Dog dog3 = new Dog(3,"dog3");
    Dog dog4 = new Dog(4,"dog4");

    //2.创建 LinkedList 只是比 ArrayList 多了6个方法
    LinkedList list = new LinkedList();
    //3.添加值  以后开发过中只会存对象
    list.add(dog1);
    list.add(dog2);
    list.add(dog3);
    list.add(dog4);

    //添加到第一个
    list.addFirst(dog4);
    list.addLast(dog1);//添加到最后


    System.out.println(list.getFirst()  );  //获取第一个
    System.out.println(list.getLast()  ); //获取最后一个

   /* //删除第一个
    list.removeFirst();
    //删除最后一个
    list.removeLast();*/

    System.out.println("------------------");
    for(int i=0;i<list.size();i++){
        System.out.println(list.get(i));
    }

}

}
