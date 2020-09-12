package com.qst.dao.impl;

import com.qst.dao.NewsScontectDao;
import com.qst.entity.NewsScontect;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NewsScontectDaoMysqlImp extends BaseDao implements NewsScontectDao {
    @Override
    public boolean insert(NewsScontect newsScontect) {
        String sql = "insert into newscontect(title,typeID,content,author,pubTime) value (?,?,?,?,?)";
        boolean b = executeUpdate(sql, new Object[]{
                newsScontect.getTitle(),
                newsScontect.getTypeID(),
                newsScontect.getContent(),
                newsScontect.getAuthor(),
                newsScontect.getPubTime()
        });
        closeAll();
        return b;
    }

    @Override
    public boolean delete(int contentID) {
        String sql = "delete from newscontect where contentID = ?";
        boolean b = executeUpdate(sql, new Object[]{contentID});
        closeAll();
        return b;
    }

    @Override
    public boolean update(NewsScontect newsScontect) {
        String sql = "update newscontect set title=?,typeID=?,content=?,author=? where contentID = ?";
        boolean b = executeUpdate(sql, new Object[]{
                newsScontect.getTitle(),
                newsScontect.getTypeID(),
                newsScontect.getContent(),
                newsScontect.getAuthor(),
                newsScontect.getContentID()
        });
        closeAll();
        return b;
    }

    @Override
    public NewsScontect getOne(int contentID) {
        String sql = "select * from newscontect where contentID = ?";
        set = executeQuery(sql, new Object[]{contentID});
        NewsScontect scontect = new NewsScontect();
        try {
            if (set.next()) {
                scontect = new NewsScontect(
                        set.getInt(1),
                        set.getString(2),
                        set.getInt(3),
                        set.getString(4),
                        set.getString(5),
                        set.getDate(6)
                );
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        closeAll();
        return scontect;
    }

    @Override
    public List<NewsScontect> getAll() {
        String sql = "select * from newscontect";
        set = executeQuery(sql);
        List<NewsScontect> list = new ArrayList<>();
        while (true) {
            try {
                while (set.next()) {
                    NewsScontect scontect = new NewsScontect(
                            set.getInt(1),
                            set.getString(2),
                            set.getInt(3),
                            set.getString(4),
                            set.getString(5),
                            set.getDate(6)
                    );
                    list.add(scontect);
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            closeAll();
            return list;
        }
    }
}