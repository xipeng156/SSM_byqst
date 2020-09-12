package com.qst.demo02.dao;

import com.qst.demo02.entity.Users;

import java.util.List;

public interface UserDao {
    void insert(Users users);
    List<Users> selectAll();
    List<Users> selectOne(int id);


    int insertTwo(Users u1,Users u2);
}
