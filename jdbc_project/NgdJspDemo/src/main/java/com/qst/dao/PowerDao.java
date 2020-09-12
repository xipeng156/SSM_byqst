package com.qst.dao;

import com.qst.entity.Power;

import java.util.List;

public interface PowerDao {
    boolean insert(Power power);
    boolean delete(int pid);
    boolean update(Power power);
    Power getOne(int pid);
    List<Power> getAll();
}
