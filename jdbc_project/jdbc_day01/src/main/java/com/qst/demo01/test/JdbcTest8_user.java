package com.qst.demo01.test;

import com.qst.demo01.dao.imp.UserMysqlDaoImp;
import com.qst.demo01.entity.Users;

import java.sql.SQLException;
import java.util.List;

public class JdbcTest8_user {
    public static void main(String[] args) throws SQLException {
        UserMysqlDaoImp imp = new UserMysqlDaoImp();
        List<Users> list = imp.getAll();
        for (Users users : list) {
            System.out.println(list.toString());
        }
    }
}
