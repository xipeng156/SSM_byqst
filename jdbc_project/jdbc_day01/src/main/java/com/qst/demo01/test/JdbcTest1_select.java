package com.qst.demo01.test;

import java.sql.*;

public class JdbcTest1_select {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        加载驱动
        Class.forName("com.mysql.jdbc.Driver");
//        创建链接
        String url="jdbc:mysql://localhost:3306/ngdtest?useSSL=false";
        String uname="root";
        String pwd = "1234";
        Connection connection = DriverManager.getConnection(url, uname, pwd);
//        获取Statement对象
        Statement statement = connection.createStatement();
        String sql = "select * from users";
//        获取查询返回值结果
        ResultSet set = statement.executeQuery(sql);
        while (set.next()){
            System.out.println(set.getInt(1)+"\t"+set.getString(2)+ "\t" +set.getString(3));
        }
//        关闭资源
        if (set!=null)
            set.close();

        if (statement!=null)
            statement.close();
        if (connection!=null)
            connection.close();
    }
}
