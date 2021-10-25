package com.cold.service.impl;

import com.cold.mapper.UserMapper;
import com.cold.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 *
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;
    @Override
    public List<Map<String, Object>> list() {
        return userMapper.list();
    }
}
