package com.qst.demo01.dao.imp;

import java.sql.*;

public class BaseDao {
    Connection connection;
    PreparedStatement statement;
    ResultSet set;

    public Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String url="jdbc:mysql://localhost:3306/ngdtest?useSSL=false";
        String uname="root";
        String pwd = "1234";
        return DriverManager.getConnection(url,uname,pwd);
    }

    public ResultSet executeQuery(String sql) throws SQLException {
        connection = getConnection();
        statement = connection.prepareStatement(sql);
//        statement.setString(1,tablename);
        set = statement.executeQuery();
        return set;
    }

    public void closeAll() throws SQLException {
        if (set!=null)
            set.close();
        if (statement!=null)
            statement.close();
        if (connection!=null)
            connection.close();
    }
}
