package com.cold.redis.serializer;

public interface KeyValueSerializer<T> {
    T get();
}