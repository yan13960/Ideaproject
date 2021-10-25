package com.example.day20;

/**
 *
 */
public class Thread06 implements Runnable {
    @Override
    public void run() {
        System.out.println("子线程名为：" + Thread.currentThread());
    }

    public static void main(String[] args) throws InterruptedException {
        Thread06 thread06=new Thread06();
        Thread t1 = new Thread(thread06);
        Thread t2 = new Thread(thread06);
        Thread t3 = new Thread(thread06);
        // 修改线程的优先级别，范围1~10（优先级别高，不一定就比低级别的抢资源多或者快）
        t1.setPriority(Thread.MAX_PRIORITY);
        // 线程让步 暗示CPU我可以让出一点资源，我可以不那么着急抢，但是我可能很厉害 还是抢到了
        Thread.yield();
        // 中断线程  不一定有用
        t1.interrupt();

        t1.start();
        t2.start();
        Thread.sleep(3000);
        t3.start();
        // 设置一个毫秒级别的睡眠时间，这个线程会让出CPU资源，暂时停止执行
        // 判断线程是否存活
        System.out.println(t1.isAlive());
    }
}
