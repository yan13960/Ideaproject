package com.javacto.redis;

import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 */
public class Test002 {
    @Test
    public void testString(){
        //1.获取连接
        Jedis jedis =new Jedis("127.0.0.1",6379);
        //Jedis jedis =new Jedis("localhost",6379);

        //2.操作
        //存
        jedis.set("age","20");

        //获取
        String username=jedis.get("username1");
        System.out.println(username);

        //删除
        jedis.del("age");
        //3.关闭连接
        jedis.close();
    }

    /**
     * 哈希类型 hash:map格式
     * hset
     * hget
     * hgetAll
     * */
@Test
    public  void testHash(){
        //1.获取连接
        Jedis jedis =new Jedis("127.0.0.1",6379);
        //2.操作
        //存
        jedis.hset("user","name","haoren1");
        jedis.hset("user","age","18");
        jedis.hset("user","address","laodf");
        //获取
        String name=jedis.hget("user","name");
        System.out.println(name);


        //获取所有
        Map<String,String> user=jedis.hgetAll("user");
        System.out.println(user);

        //3.关闭连接
        jedis.close();
    }
    /**
     *列表类型 list ：linkedlist 格式 支持重复元素
     * lpush 左边  rpush 右边
     * lpot  rpot
     * lrange start end ：范围获取
     */
@Test
    public void testList(){
        //1.获取连接
        Jedis jedis =new Jedis("127.0.0.1",6379);
        //2.操作
        //存
        jedis.lpush("mylist","a","b","c");//从左边存
        jedis.rpush("mylist","a","b","c");//从右边存
        //获取数据
        List<String> mylist = jedis.lrange("mylist", 0, -1);
        System.out.println(mylist);

        //从左边删除
        String str1 = jedis.lpop("mylist");
        System.out.println(str1);

        //从右边删除
        String str2 = jedis.rpop("mylist");
        System.out.println(str2);

        List<String> mylist2= jedis.lrange("mylist", 0, -1);
        System.out.println(mylist2);
         //3.关闭连接
        jedis.close();

    }


    /**
     * 4.集合类型set  不允许重复元素  无序
     * sadd   添加
     * smembers  获取所有元素*/
    @Test
         public void  testSet(){
             //1.获取连接
             Jedis jedis =new Jedis("127.0.0.1",6379);
             //2.操作
             //添加
             jedis.sadd("myset","java","js","php");

             //获取
        Set<String> myset = jedis.smembers("myset");

        System.out.println(myset);

        //3.关闭连接
        jedis.close();
         }

    /**
     * 4.集合类型sortedeset  不允许重复元素  有序
     * zadd   添加
     * zrange  获取所有元素*/

    @Test
    public void testSortedset(){
        //1.获取连接
        Jedis jedis =new Jedis("127.0.0.1",6379);
        //2.操作
        //添加
        jedis.zadd("sortedeset",60,"好人");
        jedis.zadd("sortedeset",20,"张三");
        jedis.zadd("sortedeset",100,"李四");

        //获取
        Set<String> mysortedeset = jedis.zrange("sortedeset", 0, -1);
        System.out.println(mysortedeset);
        //3.关闭连接
        jedis.close();
    }
}
