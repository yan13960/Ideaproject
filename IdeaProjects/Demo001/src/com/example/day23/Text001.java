package com.example.day23;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class Text001 {
    public static void main(String[] args) {
        /**
         *  HashMap 存的是键值对
         *  创建方式有两种
         *  1.Map map = new HashMap();
         *   HashMap map = new HashMap(); 不可能写
         *   键不能重复   值可以重复
         */
        Map  map=new HashMap();
        //"dg键"     "东莞1 值  "
        map.put("dg","东莞1");
        map.put("dg","东莞2");
        map.put("dg3","东莞3");
        map.put("hr","好人3");
        //获取值的时候，通过键得到值
        System.out.println(map.get("dg"));
        System.out.println(map.get("hr"));
        System.out.println(map.get("dg3"));
    }
}
