package com.javacto.servcie;

import com.javacto.dao.UserDao;
import com.javacto.dao.UserDaoImpl;
import com.javacto.po.User;
import com.javacto.utils.Page;

import java.util.List;

/**
 * describe
 * 作者：曾昭武
 */
public class UserServiceImpl implements  UserService{
    private UserDao userDao = new UserDaoImpl();

    /**
     * 查询总条数
     */
    public int getTotalCount(User user){
        return userDao.getTotalCount(user);
    }
    /**
     * 分页查询
     */
    public List<User> getPageUser(Page page, User user){
        return  userDao.getPageUser(page,user);
    }
}
