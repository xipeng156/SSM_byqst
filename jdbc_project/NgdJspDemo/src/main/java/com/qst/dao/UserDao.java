package com.qst.dao;

import com.qst.entity.Users;

import java.util.List;

public interface UserDao {
    boolean insert(Users users);
    boolean delete(int id);
    boolean update(Users users);
    Users getOne(int id);
    List<Users> getAll();
    Users login(Users user);
}
