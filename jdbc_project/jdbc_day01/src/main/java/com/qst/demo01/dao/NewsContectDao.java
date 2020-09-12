package com.qst.demo01.dao;

import com.qst.demo01.entity.NewsContect;

import java.sql.SQLException;
import java.util.List;

public interface NewsContectDao {
    List<NewsContect> getall(String sql) throws SQLException;
}
