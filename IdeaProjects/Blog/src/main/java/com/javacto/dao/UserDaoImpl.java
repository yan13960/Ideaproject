package com.javacto.dao;
import com.javacto.po.User;
import com.javacto.utils.BaseDao;
import com.javacto.utils.Page;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * describe
 * 作者：曾昭武
 */
public class UserDaoImpl implements  UserDao{// 很多同学之里忘记实现了

    /**
     * 查询总条数
     */
    public int getTotalCount(User user){
        int count = 0;
        Connection conn =null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try{
            //1.加载驱动
            conn = BaseDao.getConnection();
            String sql = "SELECT * FROM blog_user  WHERE 1=1 ";
            //3.处理预编译SQL语句  PreparedStatement  这里会使用到? 就是占位符  从左边开始数

            //4.如果有 第三步有使用到? 占位符，这里就必需给所有? 赋值   上面有多少个，必需全部赋值
            int num = 1;
            if(user!=null){
                if(!user.getBuSex().equals("")){
                    sql=sql+" and bu_sex= ?";

                }
            }
            pstm =conn.prepareStatement(sql);
            System.out.println(sql);
            if(user!=null){
                if(!user.getBuSex().equals("")){
                    pstm.setObject(num++,user.getBuSex());

                }
            }

            //结束
            //5.执行预编译SQL语句
            rs = pstm.executeQuery();
            //6.循环；
            while (rs.next()){
                //这里一定要创建User对象  请务必创建一个
                count =rs.getInt(1);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            BaseDao.closeAll(conn,pstm,rs);
        }

        return  count;
    }
    /**
     * 分页查询
     */
    public List<User> getPageUser(Page page, User user){
        //1.创建ArrayList
        List<User> list = new ArrayList<User>();
        Connection conn =null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try{
            //1.加载驱动
            conn = BaseDao.getConnection();
            String sql = "SELECT * FROM blog_user  WHERE 1=1 ";
            //3.处理预编译SQL语句  PreparedStatement  这里会使用到? 就是占位符  从左边开始数

            //4.如果有 第三步有使用到? 占位符，这里就必需给所有? 赋值   上面有多少个，必需全部赋值
            int num = 1;
            if(user!=null){
                if(!user.getBuSex().equals("")){
                    sql=sql+" and bu_sex= ?";

                }
            }

            sql+= " LIMIT ?,?";
            pstm =conn.prepareStatement(sql);

            System.out.println(sql);
            if(user!=null){
                if(!user.getBuSex().equals("")){
                    pstm.setObject(num++,user.getBuSex());

                }
            }
            //各位同学一定要debug调试
            //开始  (当前页-1)*每页显示几条
            int  begin = (page.getCurPageNo()-1)*page.getPageSize();
            int end = page.getPageSize();
            pstm.setObject(num++,begin);
            pstm.setObject(num++,end);

            //结束
            //5.执行预编译SQL语句
            rs = pstm.executeQuery();
            //6.循环；
            while (rs.next()){
                //这里一定要创建User对象  请务必创建一个
                User user1 = new User();
                user1.setBuUserId(rs.getInt(1));
                user1.setBuEmail(rs.getString(2));
                user1.setBuUserName(rs.getString(3));
                user1.setBuPassword(rs.getString(4));
                //后面的，各们同学自己完成。
                //必需把 user1  存入list集合中
                list.add(user1);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            BaseDao.closeAll(conn,pstm,rs);
        }

        return  list;

    }

}


