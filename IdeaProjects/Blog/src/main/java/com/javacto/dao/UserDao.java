package com.javacto.dao;

import com.javacto.po.User;
import com.javacto.utils.Page;

import java.util.List;

/**
 *
 */
public interface UserDao {


    /**
     * 查询总条数
     */
    public int getTotalCount(User user);
    /**
     * 分页查询
     */
    public List<User> getPageUser(Page page, User user);
}
