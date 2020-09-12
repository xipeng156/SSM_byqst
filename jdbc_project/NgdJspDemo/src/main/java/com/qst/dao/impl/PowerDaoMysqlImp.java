package com.qst.dao.impl;

import com.qst.dao.PowerDao;
import com.qst.entity.Power;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PowerDaoMysqlImp extends BaseDao implements PowerDao {
    @Override
    public boolean insert(Power power) {
        String sql = "insert into power(Pname) value(?)";
        if (executeUpdate(sql,new Object[]{power.getPanem()})){
            System.out.println("插入成功");
            closeAll();
            return true;
        }
        closeAll();
        return false;
    }

    @Override
    public boolean delete(int pid) {
        String sql = "delete from power where PID =?";
        if (executeUpdate(sql,new Object[]{pid})){
            System.out.println("删除成功");
            closeAll();
            return true;
        }
        closeAll();
        return false;
    }

    @Override
    public boolean update(Power power) {
        String sql = "update power set PName = ? where PID = ?";
        if (executeUpdate(sql,new Object[]{power.getPanem(),power.getPid()})) {
            System.out.println("修改成功");
            closeAll();
            return true;
        }
        return false;
    }

    @Override
    public Power getOne(int pid) {
        String sql = "select * from power where PID = ?";
        ResultSet set = executeQuery(sql, new Object[pid]);
        Power power = new Power();
        try {
            if (set.next()){
                power=new Power(
                        set.getInt(1),
                        set.getString(2)
                );
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return power;
    }

    @Override
    public List<Power> getAll() {
        String sql = "select * from power";
        ResultSet set = executeQuery(sql);
        ArrayList<Power> list = new ArrayList<>();
        try {
            while (set.next()){
                Power power=new Power(
                        set.getInt(1),
                        set.getString(2)
                );
                list.add(power);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return list;
    }
}
