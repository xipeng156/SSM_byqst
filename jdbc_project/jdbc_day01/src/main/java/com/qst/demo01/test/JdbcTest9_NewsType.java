package com.qst.demo01.test;

import com.qst.demo01.dao.imp.NewsTypeMysqlDaoImp;
import com.qst.demo01.entity.NewsTypes;

import java.sql.SQLException;
import java.util.List;

public class JdbcTest9_NewsType {
    public static void main(String[] args) throws SQLException {
        NewsTypeMysqlDaoImp daoImp = new NewsTypeMysqlDaoImp();
        List<NewsTypes> list = daoImp.get(3);
        for (NewsTypes types : list) {
            System.out.println(types.toString());
        }
    }
}
