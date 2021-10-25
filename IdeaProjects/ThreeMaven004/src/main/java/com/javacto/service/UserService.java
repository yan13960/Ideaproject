package com.javacto.service;

import com.javacto.po.User;
import com.javacto.utils.PageInfo;

import java.util.List;

/**
 * describe 业务层接口
 * 作者：曾昭武  adam8831
 */
public interface UserService {
    /**
     * 登陆
     * @param userName
     * @param pwd
     * @return
     */
    public   User login(String userName,String pwd);
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

    /**
     * 获取总条数
     * @return
     */
    public   int getTotalCount(User user);

    /**
     * 分页查询
     */
    public  List<User> pageQueryUser(PageInfo pageInfo, User user);

    /**
     * 根据用户名查询
     */
    public boolean findUserByName(String userName);
}
