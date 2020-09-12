package com.qst.dao;

import com.qst.entity.NewsScontect;

import java.util.List;

public interface NewsScontectDao {
    boolean insert(NewsScontect newsScontect);
    boolean delete(int contentID);
    boolean update(NewsScontect newsScontect);
    NewsScontect getOne(int contentID);
    List<NewsScontect> getAll();
}
