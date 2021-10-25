package com.example.day19作业;

import com.example.day19.Text014;
import org.apache.log4j.Logger;

import java.util.Scanner;

/**
 *
 */
public class Text001 {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age)throws Exception {
        if (age>=1&&age<=100){
            this.age = age;
        }else{
            throw new Exception ("年龄必需为1-100");
        }
    }

    public static void main(String[] args)  {
        Logger com= Logger.getLogger(Text014.class.getName());
        try {
            Text001 text001=new Text001();
            Scanner input=new Scanner(System.in);
            System.out.println("请输入年龄");
            int i=input.nextInt();
            text001.setAge(i);
            System.out.println(text001.getAge());
        }catch (Exception e){
            System.out.println("你输入的年龄有误");
            com.error("你输入的年龄有误");
            e.printStackTrace();
        }finally {
            System.out.println("程序结束");
        }
    }
}
