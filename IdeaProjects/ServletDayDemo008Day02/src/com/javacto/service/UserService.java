package com.javacto.service;

import com.javacto.po.User;

import java.util.List;

/**
 * describe 业务层接口
 * 作者：曾昭武  adam8831
 */
public interface UserService {
    /**
     * 添加
     */
    public  int addUser(User user);

    /**
     * 删除
     */
    public  int deleteUser(int id);

    /**
     * 根据ID查询
     */
    public User findUserByID(int id);

    /**
     * 修改
     */
    public  int updateUser(User user);

    /**
     * 查询所有
     */
    public List<User> queryAll();
}
