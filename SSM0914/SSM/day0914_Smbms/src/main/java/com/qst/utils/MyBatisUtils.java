package com.qst.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: XiPeng
 * @Description:
 * @Date: Create in 14:40 2020/9/14
 * @Modified by:
 */
public class MyBatisUtils {
    private static SqlSessionFactory factory;
    static String mybatisconfig="mybatis-config.xml";
    static {
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream(mybatisconfig);
            factory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static SqlSession getSqlSession(){
        return factory.openSession();
    }
    public static void close(SqlSession sqlSession){
        if (sqlSession!=null)
            sqlSession.close();
    }
}
