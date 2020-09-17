package com.qst.service;

import com.qst.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
