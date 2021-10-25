package com.cold.util;


import org.apache.commons.lang3.RandomStringUtils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 唯一序列ID，原生java算法
 * 从网上查找的源码
 *
 * @author ouyangjun
 */
public class ID {

    private static long workerId = 0L;
    private static long datacenterId = 0L;
    private static long sequence = 0L;
    private static long twepoch = 1514736000000L; //从该时间2018-01-01 00:00:00开始
    private static long workerIdBits = 5L; //节点ID长度
    private static long datacenterIdBits = 5L; //数据中心ID长度
    private static long maxWorkerId = -1L ^ (-1L << workerIdBits); //最大支持机器节点数0~31，一共32个
    private static long maxDatacenterId = -1L ^ (-1L << datacenterIdBits); //最大支持数据中心节点数0~31，一共32个
    private static long sequenceBits = 12L; //序列号12位
    private static long workerIdShift = sequenceBits; //机器节点左移12位
    private static long datacenterIdShift = sequenceBits + workerIdBits; //数据中心节点左移17位
    private static long timestampLeftShift = sequenceBits + workerIdBits + datacenterIdBits; //时间毫秒数左移22位
    private static long sequenceMask = -1L ^ (-1L << sequenceBits); //4095
    private static long lastTimestamp = -1L;

    public ID() {
        this(0L, 0L);
    }

    public ID(long workerId, long datacenterId) {
        if (workerId > maxWorkerId || workerId < 0) {
            throw new IllegalArgumentException(String.format("业务ID不能大于%d或小于0", maxWorkerId));
        }

        if (datacenterId > maxDatacenterId || datacenterId < 0) {
            throw new IllegalArgumentException(String.format("数据中心ID不能大于%d或小于0", maxDatacenterId));
        }
        this.workerId = workerId;
        this.datacenterId = datacenterId;
    }

    /**
     * 调用该方法，获取序列ID
     *
     * @return
     */
    public static synchronized long nextId() {
        long timestamp = currentTime(); //获取当前时间毫秒数
        //如果服务器时间有问题(时钟后退) 报错
        if (timestamp < lastTimestamp) {
            throw new RuntimeException(String.format("时钟向后移动。拒绝在%d毫秒内生成id", lastTimestamp - timestamp));
        }

        //如果上次生成时间和当前时间相同,在同一毫秒内
        if (lastTimestamp == timestamp) {
            //sequence自增，因为sequence只有12bit，所以和sequenceMask相与一下，去掉高位
            sequence = (sequence + 1) & sequenceMask;
            //判断是否溢出,也就是每毫秒内超过4095，当为4096时，与sequenceMask相与，sequence就等于0
            if (sequence == 0) {
                timestamp = nextMillis(lastTimestamp); //自旋等待到下一毫秒
            }
        } else {
            sequence = 0L; //如果和上次生成时间不同,重置sequence，就是下一毫秒开始，sequence计数重新从0开始累加
        }
        lastTimestamp = timestamp;
        // 最后按照规则拼出ID。
        // 000000000000000000000000000000000000000000 00000 00000 000000000000
        // time datacenterId workerId sequence
        return ((timestamp - twepoch) << timestampLeftShift) | (datacenterId << datacenterIdShift)
                | (workerId << workerIdShift) | sequence;
    }

    protected static long nextMillis(long lastTimestamp) {
        long timestamp = currentTime();
        while (timestamp <= lastTimestamp) {
            timestamp = currentTime();
        }
        return timestamp;
    }

    public static String id() {
        String prefix = DateTimeFormatter.ofPattern("yyyyMMddHHmm").format(LocalDateTime.now());
        return prefix + RandomStringUtils.random(12, "0123456789");
    }

    protected static long currentTime() {
        return System.currentTimeMillis();
    }

}