package com.qst.service.impl;

import com.qst.dao.UserDao;
import com.qst.dao.impl.UserDaoMysqlImp;
import com.qst.entity.Users;
import com.qst.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao dao = new UserDaoMysqlImp();
    @Override
    public List<Users> getAll() {
        return dao.getAll();
    }

    @Override
    public Users login(Users users) {
//        System.out.println("input is "+users.toString());
        Users login = dao.login(users);
//        System.out.println("output:" + login.toString());
//        System.out.println("input is "+users.toString());
        if (login.getUserPwd().equals(users.getUserPwd())) {
//            System.out.println("sure");
            return login;
        }
        return null;
    }

    @Override
    public Boolean delete(int id) {
        return dao.delete(id);
    }

    @Override
    public Boolean update(Users users) {
        return dao.update(users);
    }

    @Override
    public Boolean insert(Users users) {
        return dao.insert(users);
    }

}
