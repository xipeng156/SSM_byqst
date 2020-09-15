import com.qst.dao.UserMapper;
import com.qst.pojo.User;
import com.qst.utils.MyBatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import sun.misc.Resource;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Author: XiPeng
 * @Description: test_mybatis
 * @Date: Create in 11:17 2020/9/14
 * @Modified by:
 */
public class Test {
    @org.junit.Test
    public void test(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        Integer i = (Integer) sqlSession.selectOne("com.qst.dao.UserMapper.getCount");
        MyBatisUtils.close(sqlSession);
        System.out.println(i);

    }

    @org.junit.Test
    public void test2(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        Integer i = (Integer) sqlSession.selectOne("com.qst.dao.ProviderMapper.getCount");
        MyBatisUtils.close(sqlSession);
        System.out.println(i);
    }

    /**
     * 1 创建dao.UserMapper接口，实现要使用的方法
     * 2 使用sqlSession.getMapper(UserMapper.class).getCount()获取返回值
     * 3 规范化使用。返回类型和方法名需与xml文件保持一致
     */
    @org.junit.Test
    public void test3(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        Integer count = sqlSession.getMapper(UserMapper.class).getCount();
        MyBatisUtils.close(sqlSession);
        System.out.println(count);
    }

    @org.junit.Test
    public void test4(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        List<User> all = sqlSession.getMapper(UserMapper.class).getAll();
        for (User user : all) {
            System.out.println(user.toString());
        }
    }

    @org.junit.Test
    public void test5(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        User one = sqlSession.getMapper(UserMapper.class).getOne(1);
        System.out.println(one);
    }

    /**
     * 模糊查询
     */
    @org.junit.Test
    public void test6(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        List<User> users = sqlSession.getMapper(UserMapper.class).getUser("孙");
        for (User user : users) {
            System.out.println(user);
        }
    }


    @org.junit.Test
    public void getUserByNameAndRole(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        User user = new User();
        user.setUserName("张");
        user.setUserRole(3);
        List<User> users = sqlSession.getMapper(UserMapper.class).getUserByNameAndRole(user);
        for (User user1 : users) {
            System.out.println(user1);
        }
    }
}
