package com.qst.service.Impl;

import com.qst.dao.UserMapper;
import com.qst.pojo.User;
import com.qst.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author: XiPeng
 * @Description:
 * @Date: Create in 15:13 2020/9/17
 * @Modified by:
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    public int count() {
        return userMapper.count();
    }

    @Override
    public int deleteOne(int id) {
        return userMapper.deleteOne(id);
    }

    @Override
    public int updateOne(User user) {
        return userMapper.updateOne(user);
    }

    @Override
    public int insert(User user) {
        return userMapper.insert(user);
    }

    @Override
    public List<User> getUserList(Map<String, Object> userMap) {
        return userMapper.getUserList(userMap);
    }
}
