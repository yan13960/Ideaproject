package com.cold.config;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancer;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

import java.util.List;
import java.util.Random;

public class ColdRule extends AbstractLoadBalancerRule {

    //原来是纯随机策略 我们现在改为。如果一个下标已经被随机到了2次了，第三次还是同样的下标的话，那就再随机一次
    Random rand;  //  [a,b,c]  a b c
    //上次随机的下标
    private int lastIndex = -1;
    //这次随机的下标
    private int nowIndex = -1;
    //需要重新随机的下标
    private int skipIndex = -1;

    public ColdRule() {
        rand = new Random();
    }
    public Server choose(ILoadBalancer iLoadBalancer, Object o) {
        //如果为null 就不需要负载均衡
        if (iLoadBalancer == null) {
            return null;
        }
        //需要调用的服务器对象 里面有服务器IP 端口 等信息
        Server server = null;
        //如果为null 说明没有随机到服务器 需要随机一台
        while (server == null) {
            //如果线程被中断了 就停止随机
            if (Thread.interrupted()) {
                return null;
            }
            //  拿到目前能够使用的服务器
            List<Server> upList = iLoadBalancer.getReachableServers();
            //拿到所有的服务器 （所有服务器不等于目前能使用的，可能有些down机了）
            List<Server> allList = iLoadBalancer.getAllServers();
            //拿到所有服务器的数量
            int serverCount = allList.size();
            //如果没有服务器 直接退出
            if (serverCount == 0) {
                return null;
            }
            //随机抽取一台服务器的下标
            int index = rand.nextInt(serverCount);
            System.out.println("当前下标为:"+index);
            //如果抽取出来的下标等于需要重新随机的下标 就重新随机一次
            if (skipIndex>=0&&index == skipIndex) {
                System.out.println("跳过");
                index = rand.nextInt(serverCount);
                System.out.println("跳过后的下标:"+index);
            }
            //走到这里 说明不需要重新随机  吧这个值格式化
            skipIndex=-1;
            //将本次随机到的下标赋值给当前下标
            nowIndex = index;
            //如果当前的下标等于上一次的下标 说明目前这个值已经被连续随机到2次了 那么下次如果还是这个值 就需要跳过了
            if (nowIndex == lastIndex) {
                System.out.println("下一次需要跳过的下标"+nowIndex);
                //讲这个值赋值到skip里面 下次如果还是他就跳过
                skipIndex = nowIndex;
            }
            //随机完之后 当前这次的下标就赋值到lastIndex 相当于本次的结果就是【上次的结果了】
            lastIndex = nowIndex;
            //从还活着的服务器上面拿到当前这台服务器 (通过下标)
            server = upList.get(index);
            //如果为空 说明拿到的这台服务器down机了 就重新在取一个
            if (server == null) {
                //让本线程本次放弃争夺CPU资源，但是会参与下一次争夺 有可能下次还是他争夺到了
                Thread.yield();
                continue;
            }
            //如果走到这里 并且server还存活，就直接把随机到的服务器返回出去，则请求会负载均衡到本服务器上
            if (server.isAlive()) {
                return (server);
            }
            //如果走到这里，说明服务器在你负载均衡的时候死掉了， 也和上面一样 重新随机争夺一下cpu
            server = null;
            Thread.yield();
        }
        return null;
    }

    public Server choose(Object o) {
        return choose(getLoadBalancer(),o);
    }

    public void initWithNiwsConfig(IClientConfig iClientConfig) {

    }
}
