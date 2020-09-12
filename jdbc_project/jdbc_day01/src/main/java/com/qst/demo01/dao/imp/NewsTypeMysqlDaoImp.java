package com.qst.demo01.dao.imp;

import com.qst.demo01.dao.NewsTypeDao;
import com.qst.demo01.entity.NewsTypes;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NewsTypeMysqlDaoImp extends BaseDao implements NewsTypeDao {
    @Override
    public List<NewsTypes> get(int id) throws SQLException {
        connection = getConnection();
        String sql = "select * from newstypes where typeID = ?";
        statement = connection.prepareStatement(sql);
        statement.setInt(1,id);
        set = statement.executeQuery();
        ArrayList<NewsTypes> list = new ArrayList<>();
        while (set.next()){
            NewsTypes types = new NewsTypes(
                    set.getInt(1),
                    set.getString(2)
            );
            list.add(types);
        }
        return list;
    }
}
