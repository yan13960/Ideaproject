package com.example.day20;

/**
 * 主线程
 * main()方法即为主线程的入口
 * 创建很多的子线程
 * 必须最后执行完成.因为执行了各种的关闭动作
 */
public class thread01 {
    public static void main(String[] args) {
        Thread thread=Thread.currentThread();
        //获取线程的名字
        System.out.println("当前线程名为：" + thread.getName());

        //修改线程的名字
        thread.setName("我的线程");
        System.out.println("当前线程名为："+thread.getName());
    }
}
