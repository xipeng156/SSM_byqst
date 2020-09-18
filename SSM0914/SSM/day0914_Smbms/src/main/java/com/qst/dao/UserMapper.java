package com.qst.dao;

import com.qst.pojo.User;

import java.util.HashMap;
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
    List<User> getUserByNameAndRole_map(HashMap<String, Object> map);
    List<User> getUserByNameAndRoleName(User user);
    int AddOne(User user);
    int DeleteOne(String userName);
    int UpdateOne(User user);
    List<User>SelectUserByRoleID(Long id);
    List<User> getUserByNameAndRole_if(HashMap<String, Object> map);
    List<User> getUserByNameAndRole_where(HashMap<String, Object> map);
    int UpdateOneSet(User user);
    int UpdateByTrim(User user);
    List<User> getUserListArray(int[] roleArray);
    List<User> getAddressUser(User user);
}
