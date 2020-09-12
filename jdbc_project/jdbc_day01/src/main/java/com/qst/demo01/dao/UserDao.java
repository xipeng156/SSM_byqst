package com.qst.demo01.dao;

import com.qst.demo01.entity.Users;

import java.sql.SQLException;
import java.util.List;

public interface UserDao {
    List<Users> getAll() throws SQLException;
}
