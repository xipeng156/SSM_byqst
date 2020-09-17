import com.qst.dao.UserMapper;
import com.qst.pojo.User;
import com.qst.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

/**
 * @Author: XiPeng
 * @Description: test_mybatis
 * @Date: Create in 11:17 2020/9/14
 * @Modified by:
 */
public class UserTest {
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

    @org.junit.Test
    public void getUserByNameAndRole_map(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("userRole",3);
        map.put("userName","张");
        List<User> users = sqlSession.getMapper(UserMapper.class).getUserByNameAndRole_map(map);
        for (User user1 : users) {
            System.out.println(user1);
        }
    }

    @org.junit.Test
    public void getUserByNameAndRoleName(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        User user = new User();
        user.setRoleName("普通员工");
        user.setUserName("张");
        List<User> users = sqlSession.getMapper(UserMapper.class).getUserByNameAndRoleName(user);
        for (User user1 : users) {
            System.out.println(user1);
        }
    }

    @org.junit.Test
    public void AddOne(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        User user = new User();
        user.setUserName("王晓文");
        user.setUserCode("测试用户");
        user.setUserPassword("962464");
        int i = sqlSession.getMapper(UserMapper.class).AddOne(user);
        sqlSession.commit();
        System.out.println(i);
    }

    @Test
    public void DeleteOne(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        int i = sqlSession.getMapper(UserMapper.class).DeleteOne("王晓文");
        sqlSession.commit();
        System.out.println(i);
    }

    @Test
    public void UpdateOne(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        User user = new User();
        user.setId(32l);
        user.setUserCode("管理员的爸爸");
        user.setUserName("席鹏");
        int i = sqlSession.getMapper(UserMapper.class).UpdateOne(user);
        sqlSession.commit();
        System.out.println(i);
    }


    @Test
    public void SelectUserByRoleID(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        List<User> users = sqlSession.getMapper(UserMapper.class).SelectUserByRoleID(1l);
        for (User user : users) {
            System.out.println(user.toString());
        }
    }

    @Test
    public void getUserByNameAndRole_if(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        HashMap<String, Object> map = new HashMap<String, Object>();
//        map.put("userName",null);
//        map.put("userRole",3);
//        map.put("userName","张");
        List<User> userByNameAndRole_if = sqlSession.getMapper(UserMapper.class).getUserByNameAndRole_if(map);
        for (User user : userByNameAndRole_if) {
            System.out.println(user.toString());
        }
    }

    @Test
    public void getUserByNameAndRole_where(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        HashMap<String, Object> map = new HashMap<String, Object>();
//        map.put("userRole",3);
//        map.put("userName","张");
        List<User> userByNameAndRole_if = sqlSession.getMapper(UserMapper.class).getUserByNameAndRole_if(map);
        for (User user : userByNameAndRole_if) {
            System.out.println(user.toString());
        }
    }

    @Test
    public void UpdateByTrim(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        User user = new User();
        user.setId(15l);
        user.setUserCode("王鹏远的爸爸");
        user.setUserName("席鹏");
        int i = sqlSession.getMapper(UserMapper.class).UpdateByTrim(user);
        sqlSession.commit();
        System.out.println(i);
    }

    @Test
    public void UpdateOneSet(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        User user = new User();
        user.setId(15l);
        user.setUserCode("王鹏远的老父亲");
        user.setUserName("席鹏");
        int i = sqlSession.getMapper(UserMapper.class).UpdateOneSet(user);
        sqlSession.commit();
        System.out.println(i);
    }

    @Test
    public void getUserList_array(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        int[] roleArray={1,2,3};
        List<User> userList_array = sqlSession.getMapper(UserMapper.class).getUserListarray(roleArray);
        for (User user : userList_array) {
            System.out.println(user.toString());
        }
    }


}
