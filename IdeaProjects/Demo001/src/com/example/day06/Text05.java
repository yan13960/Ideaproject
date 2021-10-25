package com.example.day06;

/**
 *
 */
public class Text05 {
    public static void main(String[] args) {
        /**
         * 条件
         * 如果我们的存款  大于100万   买一辆  BMW
         * 如果我们的存款   大于 60W     买一辆  凯迪拉克
         * 如果我们的存款   大于 30W     买一辆  大众
         * 如果我们的存款   大于 10W     买一辆  比亚迪
         * 如果我们的存款   大于 5W      买一辆  自行车
         */
        int moeny=10;
        if (moeny>100){
            System.out.println("买一辆BMW");
        }else if (moeny>60){
            System.out.println("买一辆凯迪拉克");
        }else if (moeny>30){
            System.out.println("买一辆大众");
        }else if (moeny>10){
            System.out.println("买一辆比亚迪");
        }else{
            System.out.println("买一辆自行车");
        }
    }
}
