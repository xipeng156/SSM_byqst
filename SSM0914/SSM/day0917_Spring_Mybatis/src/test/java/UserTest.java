import com.qst.dao.UserMapper;
import com.qst.pojo.User;
import com.qst.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: XiPeng
 * @Description:
 * @Date: Create in 15:16 2020/9/17
 * @Modified by:
 */
public class UserTest {
    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringContext.xml");
//        context.getBean("service");
//        System.out.println(count);
        UserService userService = (UserService) context.getBean("userService");
        int count = userService.count();
        System.out.println(count);
    }

    @Test
    public void Insert(){
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringContext.xml");
        UserService userService = (UserService) context.getBean("userService");
        User user = new User();
        user.setUserName("席鹏大帅哥");
        user.setUserPassword("123456");
        int insert = userService.insert(user);
        System.out.println(insert);
    }

    @Test
    public void delete(){
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringContext.xml");
        UserService userService = (UserService) context.getBean("userService");
        int i = userService.deleteOne(18);
        System.out.println(i);
    }

    @Test
    public void update(){
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringContext.xml");
        UserService userService = (UserService) context.getBean("userService");
        User user = new User();
        user.setUserName("席鹏大帅哥-王鹏远是我儿子");
        user.setUserPassword("123456");
        user.setId(17l);
        int i = userService.updateOne(user);
        System.out.println(i);
    }

    @Test
    public void getUserList(){
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringContext.xml");
        UserService userService = (UserService) context.getBean("userService");
        HashMap<String, Object> map = new HashMap<>();
//        map.put("userName","王晓文");
//        map.put("userPassword","962464");
        List<User> userList = userService.getUserList(map);
        for (User user : userList) {
            System.out.println(user.toString());
        }
    }
}
