package com.example.day22作业;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 */
public class Text005 {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        for (int i=0;i<10;i++){
            list.add("A"+i);
        }
        Iterator iterator=list.iterator();
        while (iterator.hasNext()){
            iterator.next();

            Object object=iterator.next();

            System.out.println(object);
        }
    }
}
