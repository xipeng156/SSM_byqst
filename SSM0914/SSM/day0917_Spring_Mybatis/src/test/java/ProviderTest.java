import com.qst.pojo.Provider;
import com.qst.service.ProviderService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.List;

/**
 * @Author: XiPeng
 * @Description:
 * @Date: Create in 20:05 2020/9/19
 * @Modified by:
 */
public class ProviderTest {
    @Test
    public void insert(){
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringContext.xml");
        ProviderService providerService = (ProviderService) context.getBean("providerService");
        Provider provider = new Provider();
        provider.setProCode("ZJ_GYS002");
        provider.setProName("超市");
        int insert = providerService.insert(provider);
        System.out.println(insert);
    }
    @Test
    public void update(){
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringContext.xml");
        ProviderService providerService = (ProviderService) context.getBean("providerService");
        Provider provider = new Provider();
        provider.setProCode("ZJ_GYS002");
        provider.setProName("超市入口");
        provider.setId(16l);
        int insert = providerService.update(provider);
        System.out.println(insert);
    }

    @Test
    public void delete(){
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringContext.xml");
        ProviderService providerService = (ProviderService) context.getBean("providerService");
        int delete = providerService.delete(16);
        System.out.println(delete);
    }

    @Test
    public void select(){
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringContext.xml");
        ProviderService providerService = (ProviderService) context.getBean("providerService");
        HashMap<String, Object> map = new HashMap<>();
        map.put("proName","石家庄帅益食品贸易有限公司");
        List<Provider> list = providerService.select(map);
        for (Provider provider : list) {
            System.out.println(provider);
        }
    }
}
