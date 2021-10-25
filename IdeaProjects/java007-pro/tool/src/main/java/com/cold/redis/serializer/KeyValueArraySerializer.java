package com.cold.redis.serializer;

import java.util.List;

public interface KeyValueArraySerializer<T> {
    List<T> get();
}