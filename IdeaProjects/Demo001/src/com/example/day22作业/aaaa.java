package com.example.day22作业;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class aaaa {
    public static void main(String[] args) {


        List list = new ArrayList();
        //2.添加值  开发只会用这个添加 add()方法 还有循环  还有这一个方法  list.size()
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("a");
        //开发的时候就是按照顺序去存的，不会说我直接把结果存到下标为10的
        //3.通过get(下标)获取集合中的元素  获取下标为0的值
        System.out.println(list.get(0));
    }
}
