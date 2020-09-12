package com.qst.demo02.dao.imp;

import java.sql.*;
import java.util.List;

public class BaseDao {
    Connection connection;
    PreparedStatement statement;
    ResultSet set;

    public Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String url="jdbc:mysql://localhost:3306/ngdtest?useSSL=false";
        String uname="root";
        String pwd = "1234";
        try {
            return DriverManager.getConnection(url,uname,pwd);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return connection;
    }
//    无参查询
    public ResultSet executeQuery(String sql){
        connection = getConnection();
        try {
            statement = connection.prepareStatement(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            set = statement.executeQuery();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return set;
    }

    private void isNotNull(Object[] prams){
        if (prams!=null){
            for (int i = 0; i < prams.length; i++) {
                try {
                    statement.setObject(i+1,prams[i]);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
//多参查询
    public ResultSet executeQuery(String sql,Object[] prams){
        connection = getConnection();
        try {
            statement = connection.prepareStatement(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        isNotNull(prams);

        try {
            set = statement.executeQuery();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return set;
    }
//    无参修改
public boolean executeUpdate(String sql){
    int i=0;
    connection = getConnection();
    try {
        statement = connection.prepareStatement(sql);
    } catch (SQLException throwables) {
        throwables.printStackTrace();
    }
    try {
        i = statement.executeUpdate();
    } catch (SQLException throwables) {
        throwables.printStackTrace();
    }
    return i>0?true:false;
}

//多参修改
public boolean executeUpdate(String sql,Object[] param){
    int i=0;
    connection = getConnection();
    try {
        statement = connection.prepareStatement(sql);
    } catch (SQLException throwables) {
        throwables.printStackTrace();
    }

    isNotNull(param);

    try {
        i = statement.executeUpdate();
    } catch (SQLException throwables) {
        throwables.printStackTrace();
    }
    return i>0?true:false;
}

    public void closeAll(){
        if (set!=null) {
            try {
                set.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (statement!=null) {
            try {
                statement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (connection!=null) {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
