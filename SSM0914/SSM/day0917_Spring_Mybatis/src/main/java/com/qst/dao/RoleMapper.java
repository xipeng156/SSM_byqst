package com.qst.dao;

import com.qst.pojo.Role;

import java.util.List;
import java.util.Map;

/**
 * @Author: XiPeng
 * @Description:
 * @Date: Create in 16:01 2020/9/18
 * @Modified by:
 */
public interface RoleMapper {
    public int insert(Role role);
    public int delete(int id);
    public int update(Role role);
    public List<Role> select(Map<String,Object> map);
}
