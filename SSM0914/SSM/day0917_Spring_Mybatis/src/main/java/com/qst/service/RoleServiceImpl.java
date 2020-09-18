package com.qst.service;

import com.qst.dao.RoleMapper;
import com.qst.pojo.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author: XiPeng
 * @Description:
 * @Date: Create in 16:17 2020/9/18
 * @Modified by:
 */
@Service("roleSerivce")
public class RoleServiceImpl implements RoleService{
    @Autowired
    private RoleMapper roleMapper;
    @Override
    public int insert(Role role) {
        return roleMapper.insert(role);
    }

    @Override
    public int delete(int id) {
        return roleMapper.delete(id);
    }

    @Override
    public int update(Role role) {
        return roleMapper.update(role);
    }

    @Override
    public List<Role> select(Map<String, Object> map) {
        return roleMapper.select(map);
    }
}
