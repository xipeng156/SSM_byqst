package com.qst.dao;

import com.qst.entity.NewsScontect;
import com.qst.entity.NewsType;

import java.util.List;

public interface NewsTypesDao {
    boolean insert(NewsType newsType);
    boolean delete(int contentID);
    boolean update(NewsType newsType);
    NewsType getOne(int contentID);
    List<NewsType> getAll();
}
