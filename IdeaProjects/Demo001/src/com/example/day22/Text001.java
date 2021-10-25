package com.example.day22;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Text001 {
    public static void main(String[] args) {
        /**
         * 1.创建ArrayList 有两种方式
         * 第一种，不用 ArrayList list = new ArrayList();
         * 第二种 标准写法   List   list = new ArrayList();
         *
         * List 初始化容量为10
         */
        List list=new ArrayList();
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
        //数组下标越界
        //System.out.println(list.get(6));

        //4.获取总共有多少条数据  通过 size()方法
        System.out.println("总共有"+list.size()+"条数据");
        //这样有问题
        /*for (int i=0;i<6;i++){
            System.out.println(i);
        }*/
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
