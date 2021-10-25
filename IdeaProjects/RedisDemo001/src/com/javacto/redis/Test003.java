package com.javacto.redis;

import com.javacto.utils.JedisPoolUtils;
import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 *jdeis 连接池  jedisPool
 */
public class Test003 {

    public static void main(String[] args) {
        //1.创建JedisPoolConfig

        //JedisPoolConfig config=new JedisPoolConfig();

        //1.创建 JedisPoll 创建连接池对象
        JedisPool jedisPool=new JedisPool();

        //2.获取连接
        Jedis jedis=jedisPool.getResource();

        //3.使用
        jedis.set("sbq","好人刚创建的11111");

        //4.获取
        String str = jedis.get("sbq");
        System.out.println(str);

        //5.关闭  归还到连接池当中
        jedis.close();
    }

    @Test
    public void testJedisPool(){
        //0.创建JedisPoolConfig  配置对象
        JedisPoolConfig config=new JedisPoolConfig();

        config.setMaxTotal(50);//最大连接数

        config.setMaxIdle(10); //最大空闲连接数

        //1.创建 JedisPoll 创建连接池对象
        JedisPool jedisPool=new JedisPool(config,"locaihost",6379);

        //2.获取连接
        Jedis jedis=jedisPool.getResource();

        //3.使用
        jedis.set("sbq2","好人刚创建的222");

        //4.获取
        String str = jedis.get("sbq2");
        System.out.println(str);

        //5.关闭  归还到连接池当中
        jedis.close();
    }

    @Test
    public void testJedisPool2(){

        //2.获取连接
        Jedis jedis= JedisPoolUtils.getJedis();

        //3.使用
        jedis.set("sbq3","好人刚创建的333");

        //4.获取
        String str = jedis.get("sbq3");
        System.out.println(str);

        //5.关闭  归还到连接池当中
        jedis.close();
    }
}
