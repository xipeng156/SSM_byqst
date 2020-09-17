import com.qst.pojo.SpringTest;
import com.qst.pojo.User;
import com.qst.service.UserService;
import com.qst.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: XiPeng
 * @Description:
 * @Date: Create in 14:53 2020/9/16
 * @Modified by:
 */
public class Test {

    @org.junit.Test
    public void test(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("SpringContext.xml");
        SpringTest bean = (SpringTest) applicationContext.getBean("hello");
        System.out.println(bean.getHello());
    }

    @org.junit.Test
    public void test2(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("SpringContext.xml");
        UserService service = (UserService) applicationContext.getBean("userService");
        User user = new User();
        user.setUserName("zhangsan");
        user.setPassWord("123");
        int save = service.save(user);
        System.out.println(save);
    }
}
