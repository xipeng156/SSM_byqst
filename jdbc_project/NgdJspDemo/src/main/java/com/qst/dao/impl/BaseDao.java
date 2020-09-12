package com.qst.dao.impl;

import java.sql.*;

public class BaseDao {
    Connection connection;
    PreparedStatement statement;
    ResultSet set;

    /**
     * 获取链接：
     * 1、反射驱动
     * 2、入参，返回connection
     *
     * @return
     */
    public Connection getConnection() {
//        1、反射驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String url = "jdbc:mysql://localhost:3306/ngdtest?useSSL=false";
        String uname = "root";
        String pwd = "1234";
//       2、入参，返回connection
        try {
            return DriverManager.getConnection(url, uname, pwd);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return connection;
    }

    /**
     * 无参查询
     * 1、获取connection链接
     * 2、使用connection.prepareStatement(sql)方法传入sql
     * 3、使用statement.executeQuery()接收返回值
     *
     * @param sql
     * @return
     */
    public ResultSet executeQuery(String sql) {
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

    /**
     * 判断参数列表是否为空，若不为空则使用循环statement.setObject(i+1,prams[i])将参数列表传入
     *
     * @param prams
     */
    private void isNotNull(Object[] prams) {
        if (prams != null) {
            for (int i = 0; i < prams.length; i++) {
                try {
                    statement.setObject(i + 1, prams[i]);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }

    //多参查询
    public ResultSet executeQuery(String sql, Object[] prams) {
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
    public boolean executeUpdate(String sql) {
        int i = 0;
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
        return i > 0 ? true : false;
    }

    //多参修改
    public boolean executeUpdate(String sql, Object[] param) {
        int i = 0;
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
        closeAll();
        return i > 0 ? true : false;
    }

    public void closeAll() {
        if (set != null) {
            try {
                set.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
