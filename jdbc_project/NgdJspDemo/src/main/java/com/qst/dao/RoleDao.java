package com.qst.dao;

import com.qst.entity.Role;

import java.util.List;

public interface RoleDao {
    boolean insert(Role role);
    boolean delete(int pid);
    boolean update(Role power);
    Role getOne(int pid);
    List<Role> getAll();
}
