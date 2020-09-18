import com.qst.pojo.Role;
import com.qst.service.RoleService;
import com.qst.service.RoleServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.List;

/**
 * @Author: XiPeng
 * @Description:
 * @Date: Create in 17:31 2020/9/18
 * @Modified by:
 */
public class RoleTest {
    @Test
    public void insert(){
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringContext.xml");
        RoleServiceImpl service = context.getBean(RoleServiceImpl.class);
        Role role = new Role();
        role.setRoleCode("SMBMS_USER");
        role.setRoleName("用户");
        int insert = service.insert(role);
        System.out.println(insert);
    }

    @Test
    public void insert2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringContext.xml");
        RoleService roleSerivce = (RoleService) context.getBean("roleSerivce");
        Role role = new Role();
        role.setRoleCode("SMBMS_USER");
        role.setRoleName("用户");
        int insert = roleSerivce.insert(role);
        System.out.println(insert);
    }

    @Test
    public void update(){
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringContext.xml");
        RoleService roleSerivce = (RoleService) context.getBean("roleSerivce");
        Role role = new Role();
        role.setRoleCode("SMBMS_USER");
        role.setRoleName("用户2");
        role.setId(4);
        int insert = roleSerivce.update(role);
        System.out.println(insert);
    }

    @Test
    public void delete(){
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringContext.xml");
        RoleService roleSerivce = (RoleService) context.getBean("roleSerivce");
        int delete = roleSerivce.delete(4);
        System.out.println(delete);
    }

    @Test
    public void select(){
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringContext.xml");
        RoleService roleSerivce = (RoleService) context.getBean("roleSerivce");
        HashMap<String, Object> map = new HashMap<>();
        map.put("roleName","经理");
        List<Role> select = roleSerivce.select(map);
        for (Role role : select) {
            System.out.println(role.toString());
        }
    }
}
