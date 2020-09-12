package com.qst.demo02.dao.imp;

import com.qst.demo02.dao.UserDao;
import com.qst.demo02.entity.Users;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImp extends BaseDao implements UserDao {
    @Override
    public void insert(Users users) {
        String sql = "insert into users(userName,userPwd) value(?,?)";
        Object[] u ={users.getUserName(),users.getUserPwd()};
        if (executeUpdate(sql, u))
            System.out.println("添加成功");
        else System.out.println("添加失败");
    }

    @Override
    public List<Users> selectAll() {
        String sql = "select * from users";
        set = executeQuery(sql);
        ArrayList<Users> list = new ArrayList<>();
        while (true){
            try {
                while (set.next()){
                    Users users = new Users(
                            set.getInt(1),
                            set.getString(2),
                            set.getString(3)
                    );
                    list.add(users);
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            return list;
        }
    }

    @Override
    public List<Users> selectOne(int id) {
        String sql = "select * from users where userID=?";
        set = executeQuery(sql,new Object[]{id});
         List<Users> list = new ArrayList<>();
            try {
                if (set.next()){
                    Users users = new Users(
                            set.getInt(1),
                            set.getString(2),
                            set.getString(3)
                    );
                    list.add(users);
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        return list;
    }

    @Override
    public int insertTwo(Users u1, Users u2) {
        connection = getConnection();
        try {
            connection.setAutoCommit(false);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        String sql = "insert into users(userName,userPwd) value(?,?)";
        Object[] u ={u1.getUserName(),u1.getUserPwd()};
        if (executeUpdate(sql, u))
            System.out.println("添加成功");
        else System.out.println("添加失败");



        try {
            connection.setAutoCommit(true);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return 1;
    }

}