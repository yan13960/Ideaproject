package com.example.day08;

/**
 *
 */
public class Text002 {
    public static void main(String[] args) {
        //whlie(条件是否是true一进来就判断）
        /*while (true) {
            System.out.println("卡死了，死循环了");
            //在开发的时候，很多同学一不小心就整了个死循环
            //return；//不要加return加了后面代码就使用不了了
            break;//这种是可以，写得少
        }
        System.out.println("ddd");*/

        //这是开发过程中的标准写法
        boolean b=true;
        while (b) {//!
            System.out.println("进来了一次 后面吧b的值修改为了false");
            b = false;
        }
        //如果把b换成！b是不是里边那句话也不输入
        System.out.println("我还是能执行的");
       /* while (false) {//不能这样写 可以定义变量 但不能直接写死
        }*/
        }
    }

