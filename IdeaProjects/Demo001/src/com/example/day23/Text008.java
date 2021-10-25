package com.example.day23;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Text008 {
    public static void main(String[] args) {
        List<String>list=new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        //for(String sbq就是一个变量名:list)
        for (String str:list){
            System.out.println(str);
        }
    }
}
