package com.qst.demo01.dao.imp;

import com.qst.demo01.dao.NewsContectDao;
import com.qst.demo01.entity.NewsContect;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NewsContectMysqlDaoImp extends BaseDao implements NewsContectDao {
    @Override
    public List<NewsContect> getall(String sql) throws SQLException {
        ResultSet set = executeQuery(sql);
        ArrayList<NewsContect> list = new ArrayList<>();
        while (set.next()){
            NewsContect imp = new NewsContect(
            set.getInt(1),
            set.getString(2),
            set.getInt(3),
            set.getString(4),
            set.getString(5),
            set.getDate(6)
            );
            list.add(imp);
        }
        return list;
    }
}
