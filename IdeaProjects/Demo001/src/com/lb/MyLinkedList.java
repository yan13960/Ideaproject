package com.lb;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 *
 */
public class MyLinkedList implements Iterable{

    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    @Override
    public Iterator iterator() {
  //匿名内部类
        return new Iterator() {

            Node node=first;//外部类的私有成员
            public boolean hasNext() {
                return node!=null;
            }


            public Object next() {
                int value=node.data;
                node=node.next;
                return value;
            }
        };
    }


    @Override
    public void forEach(Consumer action) {

    }


    @Override
    public Spliterator spliterator() {
        return null;
    }
 //静态内部类
    private static class Node {
        public int data;
        public Node next;

        public Node() {
        }
        public Node(int value) {
            this.data = value;
        }
    }

     private Node first=null;
     private Node current=null;

    /**
     * 在MyLinkedList对象中添加元素
     * @param value--元素的数据
     */
    public  void add(int value){
         //产生一个新的节点
        Node newNode=new Node(value);
        //如果没有任何节点存在
        if(first==null){
            first=newNode;
            current=newNode;
        }else{
            //如果不是第一个节点
            current.next=newNode;
            current=newNode;
        }

    }

    /**
     * 在控制台显示数据
     */

    public  void display() {
        Node node = first;
        while (node != null) {
            int value = node.data;
            System.out.println(value);
            node = node.next;
        }
    }
}
