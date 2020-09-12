package com.qst.test;

import com.qst.dao.NewsScontectDao;
import com.qst.dao.NewsTypesDao;
import com.qst.dao.impl.*;
import com.qst.entity.*;

import java.sql.Date;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        UserDaoMysqlImp dao = new UserDaoMysqlImp();
        System.out.println(dao.getAll());
        System.out.println("================");
        System.out.println(dao.getOne(3));
//        dao.delete(100);
        if (dao.update(new Users(101,"12344","123")))
            System.out.println("更新成功");
        System.out.println(dao.getOne(101));
    }
    @org.junit.Test
    public void newsscontecttest1(){
        NewsScontectDao dao = new NewsScontectDaoMysqlImp();
        List<NewsScontect> list = dao.getAll();
        for (NewsScontect scontect : list) {
            System.out.println(scontect.toString());
        }
        System.out.println("==============================");
        System.out.println(dao.getOne(1));
        System.out.println("==============================");
        dao.delete(1);
        dao.insert(new NewsScontect("阿西吧", 111,"111","tom"));
        if(dao.update(new NewsScontect(7,"7",1,"111","阿西吧")))
            System.out.println("修改成功");
        System.out.println(dao.getOne(7));
    }
    @org.junit.Test
    public void NewsTypes(){
        NewsTypesDao dao = new NewsTypeDaoMysqlImp();
        List<NewsType> list = dao.getAll();
        for (NewsType type : list) {
            System.out.println(type.toString());
        }
        System.out.println("=========================");
        System.out.println(dao.getOne(1));
        System.out.println("=========================");
        dao.insert(new NewsType("时政要闻"));
        System.out.println("=========================");
        dao.delete(7);
        dao.update(new NewsType(6,"shui"));
    }
    @org.junit.Test
    public void power(){
        PowerDaoMysqlImp imp = new PowerDaoMysqlImp();
        imp.insert(new Power("zhangsan"));
        System.out.println("=======================");
//        imp.delete(1);
        imp.update(new Power(2,"lisi"));
        System.out.println("=======================");
        List<Power> list = imp.getAll();
        for (Power power : list) {
            System.out.println(power.toString());
        }
        System.out.println("=======================");
        Power one = imp.getOne(1);
        System.out.println(one.toString());
    }
    @org.junit.Test
    public void role(){
        RoleDaoMysqlImp imp = new RoleDaoMysqlImp();

        imp.insert(new Role("hehehe"));

        List<Role> list = imp.getAll();
        for (Role role : list) {
            System.out.println(role.toString());
        }
        System.out.println("===========");
        System.out.println(
                imp.getOne(1).toString());
        System.out.println("=================");
        imp.delete(1);
        imp.update(new Role(2,"jjj"));
    }
}