package com.cold.dao;

import com.cold.po.City1;
import com.cold.po.Province1;
import com.cold.utils.DBUtil;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * describe
 * 作者：曾昭武
 */
public class ProvinceCityDaoImpl implements  ProvinceCityDao{

    /**
     * 获取省
     */
    public List<Province1> getProvince(){
        List<Province1> list = new ArrayList<Province1>();
        Connection conn =null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try {
            //2.建立连接
            conn = DBUtil.getConnection();
            //3.处理预编译SQL语句  PreparedStatement  这里会使用到? 就是占位符  从左边开始数
            pstm =conn.prepareStatement("SELECT * FROM province");
            //4.如果有 第三步有使用到? 占位符，这里就必需给所有? 赋值   上面有多少个，必需全部赋值
            //5.执行预编译SQL语句
            rs = pstm.executeQuery();
            //6.循环；
            while (rs.next()){
                Province1 province = new Province1();
                province.setId(rs.getString(1));
                province.setCodePid(rs.getString(2));
                province.setName(rs.getString(3));

                //这里很多同学忘记了   把 province添加到 list集合中
                list.add(province);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            DBUtil.closeAll(conn,pstm,rs);
        }

        return list;

    }

    /**
     * 获取市
     * pId 省id
     */
    public List<City1> getCity(String pId){
        List<City1> list = new ArrayList<City1>();
        Connection conn =null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try {
            //2.建立连接
            conn = DBUtil.getConnection();
            //3.处理预编译SQL语句  PreparedStatement  这里会使用到? 就是占位符  从左边开始数
            pstm =conn.prepareStatement("SELECT * FROM city WHERE code_pid=?");
            //4.如果有 第三步有使用到? 占位符，这里就必需给所有? 赋值   上面有多少个，必需全部赋值
            pstm.setObject(1,pId);
            //5.执行预编译SQL语句
            rs = pstm.executeQuery();
            //6.循环；
            while (rs.next()){
                City1 city = new City1();
                city.setId(rs.getString(1));
                city.setCodeCid(rs.getString(2));
                city.setName(rs.getString(3));
                //这里很多同学忘记了   把 province添加到 list集合中
                list.add(city);

            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            DBUtil.closeAll(conn,pstm,rs);
        }

        return list;
    }
}
