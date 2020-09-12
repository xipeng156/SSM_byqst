package com.qst.demo02;

import com.qst.demo02.dao.imp.UserDaoImp;
import com.qst.demo02.entity.Users;

import java.util.List;

public class test {
    public static void main(String[] args) {
        UserDaoImp daoImp = new UserDaoImp();
        Users users = new Users(100, "123", "123");
        daoImp.insert(users);
        List<Users> list = daoImp.selectOne(100);
        for (Users users1 : list) {
            System.out.println(users1.toString());
        }
        System.out.println("====================");
        List<Users> list1 = daoImp.selectAll();
        for (Users users1 : list1) {
            System.out.println(users1.toString());
        }
    }
}
