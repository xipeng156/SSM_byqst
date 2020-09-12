package com.qst.dao.impl;

import com.qst.dao.RoleDao;
import com.qst.entity.Role;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RoleDaoMysqlImp extends BaseDao implements RoleDao {
    @Override
    public boolean insert(Role role) {
        String sql = "insert into role(RName) value (?)";
        if (executeUpdate(sql,new Object[]{
                role.getRname()
        })) {
            closeAll();
            System.out.println("插入成功");
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(int pid) {
        String sql = "delete from role where RID = ?";
        if (executeUpdate(sql,new Object[]{
                pid
        })) {
            System.out.println("删除成功");
            closeAll();
            return true;
        }
        return false;
    }

    @Override
    public boolean update(Role power) {
        String sql = "update role set RName = ? where RID = ?";
        if (executeUpdate(sql,new Object[]{
                power.getRname(),power.getRid()
        })) {
            System.out.println("修改成功");
            closeAll();
            return true;
        }
        return false;
    }

    @Override
    public Role getOne(int pid) {
        String sql = "select * from role where RID = ?";
        Role role = new Role();
        ResultSet set = executeQuery(sql, new Object[]{
                pid
        });

            try {
                if (set.next()){
                role=new Role(set.getInt(1),set.getString(2));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return role;
    }


    @Override
    public List<Role> getAll() {
        String sql ="select * from role";
        ArrayList<Role> l = new ArrayList<>();
        ResultSet set = executeQuery(sql);

            try {
                while (set.next()){
                Role role = new Role();
                role.setRid(set.getInt(1));
                role.setRname(set.getString(2));
                l.add(role);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return l;
        }
}
