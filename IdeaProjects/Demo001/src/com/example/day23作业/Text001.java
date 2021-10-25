package com.example.day23作业;

import com.example.day23.Dog;
import com.example.day23作业.Computer;
import com.example.day23作业.Penguin;
import com.example.day23作业.Phone;

import java.util.ArrayList;
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
        List<Penguin>list1=new ArrayList<Penguin>();
        List<Phone>list2=new ArrayList<Phone>();
        List<Computer>list3=new ArrayList<Computer>();
        //3.添加值
        list1.add(penguin1);
        list1.add(penguin2);
        list2.add(phone1);
        list2.add(phone2);
        list3.add(computer1);
        list3.add(computer2);
        for (Penguin penguin:list1){
            System.out.println(penguin);
        }
        for (Phone phone:list2){
            System.out.println(phone);
        }
        for (Computer computer:list3){
            System.out.println(computer);
        }
    }
}
