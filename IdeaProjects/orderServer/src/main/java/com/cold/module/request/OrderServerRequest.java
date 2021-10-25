package com.cold.module.request;

import com.cold.module.info.RpcInfo;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 */
public class OrderServerRequest {
/**
 * 发布服务
 */
    public void publishServer() throws Exception {
        ServerSocket serverSocket =new ServerSocket(6666);
        //通过while (true)持续暴露服务,为了有并发能力，可以使用线程池来专门处理
        ExecutorService executorService= Executors.newFixedThreadPool(10);
        while (true) {
            System.out.println("wait connection");
            //accept阻塞等待连接
            Socket socket = serverSocket.accept();
            executorService.execute(new OrderServerHandler(socket));
           /* ObjectInputStream objectInputStream=new ObjectInputStream(socket.getInputStream());
            RpcInfo rpcInfo  =(RpcInfo) objectInputStream.readObject();*/
            System.out.println("success connection...");
        }
    }
}
