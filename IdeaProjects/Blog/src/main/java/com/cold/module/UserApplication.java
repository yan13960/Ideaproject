package com.cold.module;

import com.cold.module.info.RpcInfo;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 *
 */
public class UserApplication {
    public static void main(String[] args) throws IOException {
        /**序列化
         * 网络通信 tcp socket
         * java反射 得到了类的所有信息 然后就可以通过java反射进行方法的调用
         * Rpc 框架
         *
         * 还需要服务注册中心 zook redis nacos
         */

        //现在要调用OrderServer的方法
        //首先要连接上远程服务
        Socket socket=new Socket("127.0.0.1",6666);
        /**
         *假设知道一切的信息
         * 类的包名
         * 类名
         * 方法名
         * 方法参数类型
         */
        RpcInfo rpcInfo=new RpcInfo();
        rpcInfo.setPackageName("com.cold.module.controller");
        rpcInfo.setClassName("OrderController");
        rpcInfo.setMethodName("info");
        Object[] methodArgs=new Object[]{"周老师"};
        rpcInfo.setMethodArgs(methodArgs);

        ObjectOutputStream objectOutputStream=new ObjectOutputStream(socket.getOutputStream());
        objectOutputStream.writeObject(rpcInfo);
        objectOutputStream.flush();
        objectOutputStream.close();
    }
}
