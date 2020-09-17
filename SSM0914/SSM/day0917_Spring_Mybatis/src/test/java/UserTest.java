import com.qst.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
        UserService userService = (UserService) context.getBean("userService");
        System.out.println(userService.count());
    }
}
