package com.qst.service;

import com.qst.dao.UserDao;
import com.qst.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @Author: XiPeng
 * @Description:
 * @Date: Create in 15:21 2020/9/16
 * @Modified by:
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public UserServiceImpl() {
    }

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public int save(User user) {
        return userDao.save(user);
    }
}