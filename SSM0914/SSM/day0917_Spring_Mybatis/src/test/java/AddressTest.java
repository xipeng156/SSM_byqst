import com.qst.dao.AddressMapper;
import com.qst.pojo.Address;
import com.qst.service.AddressService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.List;

/**
 * @Author: XiPeng
 * @Description:
 * @Date: Create in 16:26 2020/9/19
 * @Modified by:
 */
public class AddressTest {
    @Test
    public void insert(){
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringContext.xml");
        AddressService service = (AddressService) context.getBean("addressService");
        Address address = new Address();
        address.setContact("王晓文");
        address.setAddressDesc("内蒙古赤峰市宁城县");
        int insert = service.insert(address);
        System.out.println(insert);
    }

    @Test
    public void update(){
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringContext.xml");
        AddressService service = (AddressService) context.getBean("addressService");
        Address address = new Address();
        address.setContact("席鹏");
        address.setAddressDesc("内蒙古赤峰市宁城县三座店镇乌苏台洼村一组");
        address.setId(1);
        int insert = service.update(address);
        System.out.println(insert);
    }

    @Test
    public void delete(){
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringContext.xml");
        AddressService service = (AddressService) context.getBean("addressService");
        int insert = service.delete(1);
        System.out.println(insert);
    }

    @Test
    public void select(){
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringContext.xml");
        AddressService service = (AddressService) context.getBean("addressService");
        HashMap<String, Object> map = new HashMap<>();
        map.put("contact","王晓文");
        map.put("addressDesc","内蒙古赤峰市宁城县三座店镇乌苏台洼村");
        List<Address> list = service.select(map);
        for (Address address : list) {
            System.out.println(address.toString());
        }
    }
}
