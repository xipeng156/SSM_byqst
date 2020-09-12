package com.qst.demo01.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest2_add {
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

        String add = "INSERT INTO users (userName, userPwd)\n" +
                "VALUE\n" +
                "\t('李四', '123'),\n" +
                "\t('李四', '123'),\n" +
                "\t('李四', '123');\n";
//        插入操作
        int update = statement.executeUpdate(add);
        if (update>0)
            System.out.println("添加成功！");
        else System.out.println("添加失败");

        if (statement!=null)
            statement.close();
        if (connection!=null)
            connection.close();
    }
}
