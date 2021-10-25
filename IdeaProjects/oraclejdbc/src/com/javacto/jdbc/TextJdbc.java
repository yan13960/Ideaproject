package com.javacto.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 */
public class TextJdbc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","xiaoming2","1234");
        //请各位同学必需测试是否连接成功了
        System.out.println(conn);//oracle.jdbc.driver.T4CConnection@2d363fb3
        //调用存储过程  CallableStatement
        CallableStatement sbq = conn.prepareCall("call insert22_t1(?,?)");
        //给？号赋值
        sbq.setObject(1,6 );
        sbq.setObject(2,"java代码2");
        //执行
        int i = sbq.executeUpdate();
        System.out.println(i);
        //释放资源
        sbq.close();
        conn.close();
    }
}
