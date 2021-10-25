package com.lb;

import java.util.LinkedList;

/**
 *
 */
public class MainDemo {
    public static void main(String[] args) {
        /*Node node = new Node(10);

        Node node1=new Node();
        node1.data=3;*/

        MyLinkedList list=new MyLinkedList();
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(9);
        list.add(7);

        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println("--------------------------");
        int[]test=new int[]{10,3,5,7,9};
        for (int i : test) {
            System.out.println(i);
        }
    }
}
