package com.qst.service;

import com.qst.pojo.Role;

import java.util.List;
import java.util.Map;

/**
 * @Author: XiPeng
 * @Description:
 * @Date: Create in 16:16 2020/9/18
 * @Modified by:
 */
public interface RoleService {
    public int insert(Role role);
    public int delete(int id);
    public int update(Role role);
    public List<Role> select(Map<String,Object> map);
}
