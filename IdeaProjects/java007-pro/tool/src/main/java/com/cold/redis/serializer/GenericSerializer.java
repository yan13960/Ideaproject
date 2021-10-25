package com.cold.redis.serializer;

public interface GenericSerializer<T> {

    void toCache(T t);

    String getCache();

    T covert(String cache);

    T select();
}