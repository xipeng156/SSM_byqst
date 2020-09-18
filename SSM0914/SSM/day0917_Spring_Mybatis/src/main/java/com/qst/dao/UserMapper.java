package com.qst.dao;

import com.qst.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Author: XiPeng
 * @Description:
 * @Date: Create in 14:56 2020/9/17
 * @Modified by:
 */
public interface UserMapper {
    int count();
    int deleteOne(int id);
    int updateOne(User user);
    int insert(User user);
    List<User> getUserList(Map<String,Object> userMap);
}
