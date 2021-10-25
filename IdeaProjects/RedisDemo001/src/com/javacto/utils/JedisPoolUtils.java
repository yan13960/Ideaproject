package com.javacto.utils;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 */
public  class JedisPoolUtils {
    private static JedisPool jedisPool;

     //类加载之前会执行的代码块
    static {
        //1.读取配置文件
         InputStream is =JedisPoolUtils.class.getClassLoader().getResourceAsStream("jdeis.properties");
         //2.创建Properties
         Properties pro=new Properties();
         //3.
         try{
             pro.load(is);
         }catch (Exception e){
             e.printStackTrace();
         }
         System.out.println(pro.getProperty("host"));
         System.out.println(pro.get("port"));
         System.out.println(pro.get("maxTotal"));
         System.out.println(pro.get("maxIdle"));

         //0.创建JedisPoolConfig  配置对象
         JedisPoolConfig config=new JedisPoolConfig();

         //最大连接数
         config.setMaxTotal(Integer.parseInt(pro.getProperty("maxTotal")));
         //最大空闲连接数
         config.setMaxIdle(Integer.parseInt(pro.getProperty("maxIdle")));

         jedisPool=new JedisPool(config,"localhost",Integer.parseInt(pro.getProperty("port")));
    }

    public static Jedis getJedis(){
        Jedis jedis =jedisPool.getResource();
        return jedis;
    }

    public static void main(String[] args) {
        System.out.println(JedisPoolUtils.getJedis());
    }
}
