package com.qst.dao.impl;

import com.qst.dao.UserDao;
import com.qst.entity.Users;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDaoMysqlImp extends BaseDao implements UserDao {
    @Override
    public boolean insert(Users users) {
//        connection=getConnection();
        String sql = "insert into users(userName,userPwd) value(?,?)";
        boolean b = executeUpdate(sql, new Object[]{users.getUserName(), users.getUserPwd()});
        closeAll();
        return b;
    }

    @Override
    public boolean delete(int id) {
        String sql = "delete from users where userID = ?";
        boolean b = executeUpdate(sql, new Object[]{id});
        closeAll();
        return b;

    }

    @Override
    public boolean update(Users users) {
        String sql = "update users set userName = ? , userPwd = ? where userID = ?";
        boolean b = executeUpdate(sql, new Object[]{
                users.getUserName(),
                users.getUserPwd(),
                users.getUserID()
        });
        closeAll();
        return b;
    }

    @Override
    public Users getOne(int id) {
        String sql = "select * from users where userID = ?";
        ResultSet set = executeQuery(sql, new Object[]{id});
        Users users = null;
        try {
            if (set.next()){
                users = new Users(
                        set.getInt(1),
                        set.getString(2),
                        set.getString(3)
                );
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        closeAll();
        return users;
    }

    @Override
    public List<Users> getAll() {
        String sql = "select * from users";
        ResultSet set = executeQuery(sql);
        ArrayList<Users> list = new ArrayList<>();
        try {
            while (set.next()){
                Users users = new Users(
                        set.getInt(1),
                        set.getString(2),
                        set.getString(3));
                list.add(users);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        closeAll();
        return list;
    }

    public Users login(Users user) {
        String sql = "select * from users where userName = ?";
        ResultSet set = executeQuery(sql, new Object[]{user.getUserName()});
        Users users = null;
        try {
            if (set.next()){
                users = new Users(
                        set.getInt(1),
                        set.getString(2),
                        set.getString(3)
                );
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        closeAll();
        return users;
    }
}
