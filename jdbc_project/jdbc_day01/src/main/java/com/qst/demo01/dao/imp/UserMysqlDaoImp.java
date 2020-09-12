package com.qst.demo01.dao.imp;

import com.qst.demo01.dao.UserDao;
import com.qst.demo01.entity.Users;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserMysqlDaoImp extends BaseDao implements UserDao {

    @Override
    public List<Users> getAll() throws SQLException {
        ArrayList<Users> list = new ArrayList<>();
        connection = getConnection();
       String sql = "select * from users";
       statement = connection.prepareStatement(sql);
       set = statement.executeQuery();
       while (set.next()){
           Users users = new Users(
                   set.getInt(1),
                   set.getString(2),
                   set.getString(3)
           );
           list.add(users);
       }
       closeAll();
       return list;
    }
}