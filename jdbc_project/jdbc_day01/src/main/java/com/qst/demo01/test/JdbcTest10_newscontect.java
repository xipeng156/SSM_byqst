package com.qst.demo01.test;

import com.qst.demo01.dao.imp.NewsContectMysqlDaoImp;
import com.qst.demo01.entity.NewsContect;

import java.sql.SQLException;
import java.util.List;

public class JdbcTest10_newscontect {
    public static void main(String[] args) throws SQLException {
        NewsContectMysqlDaoImp i = new NewsContectMysqlDaoImp();
        String sql = "select * from newscontect";
        List<NewsContect> getall = i.getall(sql);
        for (NewsContect contect : getall) {
            System.out.println(contect.toString());
        }
    }
}
