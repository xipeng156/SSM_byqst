package com.qst.dao;

import com.qst.pojo.User;

import java.util.List;

/**
 * @Author: XiPeng
 * @Description:
 * @Date: Create in 15:07 2020/9/14
 * @Modified by:
 */
public interface UserMapper {
    public Integer getCount();
    public List<User> getAll();
    public User getOne(int id);
    public List<User> getUser(String username);
    public List<User> getUserByNameAndRole(User user);
}
