package com.qst.demo01.dao;

import com.qst.demo01.entity.NewsTypes;

import java.sql.SQLException;
import java.util.List;

public interface NewsTypeDao {
    List<NewsTypes> get(int typeId) throws SQLException;
}
