import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPubSub;

/**
 *
 */
public class redisTest {
    @Test
    public void  testSet(){

       /*     Jedis jedis = new Jedis("192.168.223.132",6379);
            jedis.auth("1234");
            jedis.set("name","lilei");
        String name = jedis.get("name");
        System.out.println(name);
        String a = jedis.get("a");
        System.out.println(a);
*/
        Jedis jedis = RedisUtil.getJedis();
        String test = jedis.get("test");
        System.out.println(test);

    }

    //订阅
    @Test
    public void testSubscribe() {
        Jedis jedis = new Jedis("192.168.223.132" , 6379);
        jedis.auth("1234");
        jedis.subscribe(new JedisPubSub() {
            @Override
            public void onMessage(String channel, String message) {
                System.out.println("receive channel ["+channel+"] message ["+message+"]");
            }
        } , "aiqiyi" , "TencentTV");
    }
    //发布
    @Test
    public void testPublish() {
        Jedis jedis = new Jedis("192.168.223.132" , 6379);
        jedis.auth("1234");
        jedis.publish("aiqiyi" , "天龙八部上线了！");
        jedis.publish("TencentTV" , "笑傲江湖上线了！");
    }
}
