package com.qst.demo01.test;

import java.sql.*;

public class JdbcTest7_delete {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        加载驱动
        Class.forName("com.mysql.jdbc.Driver");
//        创建链接
        String url="jdbc:mysql://localhost:3306/ngdtest?useSSL=false";
        String uname="root";
        String pwd = "1234";
        Connection connection = DriverManager.getConnection(url, uname, pwd);
//        获取Statement对象
        String delete = "delete from users where userID=?";
        PreparedStatement statement = connection.prepareStatement(delete);
        statement.setString(1,"2");

//        删除
        int i = statement.executeUpdate();
        if (i > 0) {
            System.out.println("删除成功");
        } else {
            System.out.println("删除失败");
        }

        if (statement!=null)
            statement.close();
        if (connection!=null)
            connection.close();
    }
}
