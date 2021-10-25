package com.cold.module.request;

import com.cold.module.info.RpcInfo;

import java.io.ObjectInputStream;
import java.lang.reflect.Method;
import java.net.Socket;

/**
 *
 */
public class OrderServerHandler implements Runnable {
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    private Socket socket;
    public OrderServerHandler(Socket socket){
        this.socket =socket;
    }
    public void run() {
        /**
         *通过io流读取socket的信息
         *拿到信息后调用方法
         */
        try {
            ObjectInputStream objectInputStream=new ObjectInputStream(socket.getInputStream());
            RpcInfo rpcInfo  =(RpcInfo) objectInputStream.readObject();
            Class<?> aClass=Class.forName(rpcInfo.getPackageName() + "." + rpcInfo.getClassName());
            //定义一个参数类型数组，数组的长度就是传过来的长度 这样我们就可以确定有几个参数
            //根据参数数量才能确定方法（因为方法有重载）
            Class[] classes = new Class[rpcInfo.getMethodArgs().length];
            for (int i = 0; i < classes.length; i++) {
                classes[i]=rpcInfo.getMethodArgs()[i].getClass();
            }
            Method method = aClass.getMethod(rpcInfo.getMethodName(), classes);
            method.invoke(aClass.newInstance(),rpcInfo.getMethodArgs());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
