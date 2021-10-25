package com.javacto.redis;

import redis.clients.jedis.Jedis;

/**
 *
 */
public class Test001 {
    public static void main(String[] args) {
             //1.获取连接
        Jedis jedis =new Jedis("127.0.0.1",6379);
        //Jedis jedis =new Jedis("localhost",6379);

        //2.操作
        jedis.set("username1","haoren");

        //3.关闭连接
        jedis.close();

    }
}
