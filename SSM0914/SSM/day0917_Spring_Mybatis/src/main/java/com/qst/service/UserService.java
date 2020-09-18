package com.qst.service;

import com.qst.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @Author: XiPeng
 * @Description:
 * @Date: Create in 15:13 2020/9/17
 * @Modified by:
 */
public interface UserService {
    public int count();
    public int deleteOne(int id);
    public int updateOne(User user);
    public int insert(User user);
    List<User> getUserList(Map<String,Object> userMap);
}
