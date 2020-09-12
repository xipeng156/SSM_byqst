package com.qst.service;

import com.qst.entity.Users;

import java.util.ArrayList;
import java.util.List;

public interface UserService {
    List<Users> getAll();
    Users login(Users users);
    Boolean delete(int id);
    Boolean update(Users users);
    Boolean insert(Users users);
}
