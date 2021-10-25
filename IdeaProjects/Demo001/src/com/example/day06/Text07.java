package com.example.day06;

/**
 *
 */
public class Text07 {
    public static void main(String[] args) {
         /* Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();*/
        /**
         * 通过用户输入 ,我就不输入，我直接写死，大家通用输入 age   年龄
         *   如果小如  18  听妈妈的话
         *   如果  18 至   30 爱干嘛干嘛
         *     30 至 50  结婚生娃
         *     50 至70  到处浪
         *     否则 安乐死
         */
        int age=80;
        if (age<18){
            System.out.println("听妈妈的话");
        }else if (age<30){
            System.out.println("爱干嘛干嘛");
        }else if (age<50){
            System.out.println("结婚生娃");
        }else if (age<70){
            System.out.println("到处浪");
        }else{
            System.out.println("安乐死");
        }
    }
}
