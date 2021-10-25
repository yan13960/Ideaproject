package com.example.day06;

/**
 *
 */
public class Text03 {
    public static void main(String[] args) {
        /**
         * 成绩 大于80 以上  良  不包括 80      包括80没有
         *   60至80   中等    包括了60 80
         *   小于  60 差   包括60吗  ?  不包括
         *
         *   这样我是讲思路让大家能看懂， Test004是标准写法
         */
        int javaSe=60;
        if (javaSe>80){
            System.out.println("良");
        }
        else if (javaSe>=60){
            System.out.println("中等");
        }
        else{
            System.out.println("差");
        }
        System.out.println("我是一定会输出的");
    }
}
