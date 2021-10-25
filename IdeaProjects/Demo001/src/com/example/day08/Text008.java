package com.example.day08;

/**
 *
 */
public class Text008 {
    public static void main(String[] args) {
        //debug  非常重要，请大务必把每天抄写完我的代码过过debug 运行一次 ，然后把自己写的代码debug运行多次
        //把之前的选择结构也通过debug去试试。这种刚开始很不习惯，使用一段时间，就习惯了
        //刚开始这也不懂，那也不懂很正常。正常能运用非常熟练，需要几个月时间，每天使用
        //你说你不会，搞不懂，刚开始很正常，一定要去练
        //我们后面讲day11的时候，还会再讲一次debug,如果我今天讲太多了，一下接受不了，很多同学
        //一位合格开发者，debug非常熟练，如不会，进公司问题都解决不了。


        System.out.println("debug开始了  ");
        int num = 1;
        //现在我用debug 今天后面课程会教大家使用
        while (num <= 5) {//我把=  去掉，请问包括5吗?
            System.out.println("抄代码第" + num + "遍");
            num++;
            System.out.println("我是在while 里面");
        }

        System.out.println(num);

        System.out.println("debug结束 了  ");
    }
}
