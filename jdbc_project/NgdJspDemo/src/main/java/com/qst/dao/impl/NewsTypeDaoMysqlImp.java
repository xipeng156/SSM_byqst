package com.qst.dao.impl;

import com.qst.dao.NewsScontectDao;
import com.qst.dao.NewsTypesDao;
import com.qst.entity.NewsScontect;
import com.qst.entity.NewsType;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NewsTypeDaoMysqlImp extends BaseDao implements NewsTypesDao {
    @Override
    public boolean insert(NewsType newsType) {
        String sql = "insert into newstypes(typeName) value (?)";
        boolean b = executeUpdate(sql, new Object[]{
                newsType.getTypeName()
        });
        closeAll();
        return b;
    }

    @Override
    public boolean delete(int typeID) {
        String sql = "delete from newstypes where typeID = ?";
        boolean b = executeUpdate(sql, new Object[]{typeID});
        closeAll();
        return b;
    }

    @Override
    public boolean update(NewsType newsType) {
        String sql = "update newstypes set typeName=? where typeID = ?";
        boolean b = executeUpdate(sql, new Object[]{
                newsType.getTypeName(),
                newsType.getTypeID()
        });
        closeAll();
        return b;
    }

    @Override
    public NewsType getOne(int contentID) {
        String sql = "select * from newstypes where typeID = ?";
        set = executeQuery(sql, new Object[]{contentID});
        NewsType scontect = new NewsType();
        try {
            if (set.next()) {
                scontect = new NewsType(
                        set.getInt(1),
                        set.getString(2)
                );
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        closeAll();
        return scontect;
    }

    @Override
    public List<NewsType> getAll() {
        String sql = "select * from newstypes";
        set = executeQuery(sql);
        List<NewsType> list = new ArrayList<>();
        while (true) {
            try {
                while (set.next()) {
                    NewsType scontect = new NewsType(
                            set.getInt(1),
                            set.getString(2)
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