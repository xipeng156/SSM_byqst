import com.qst.pojo.Bill;
import com.qst.service.BillService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.List;

/**
 * @Author: XiPeng
 * @Description:
 * @Date: Create in 18:56 2020/9/19
 * @Modified by:
 */
public class BillTest {
    @Test
    public void insert(){
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringContext.xml");
        BillService billService = (BillService) context.getBean("billService");
        Bill bill = new Bill();
        bill.setBillCode("BILL2016_019");
        bill.setProductName("红烧猪蹄");
        int insert = billService.insert(bill);
        System.out.println(insert);
    }
    @Test
    public void update(){
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringContext.xml");
        BillService billService = (BillService) context.getBean("billService");
        Bill bill = new Bill();
        bill.setBillCode("BILL2016_019");
        bill.setProductName("红烧猪蹄好好吃");
        bill.setId(19);
        int update = billService.update(bill);
        System.out.println(update);
    }
    @Test
    public void delete(){
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringContext.xml");
        BillService billService = (BillService) context.getBean("billService");
        int delete = billService.delete(19);
        System.out.println(delete);
    }
    @Test
    public void select(){
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringContext.xml");
        BillService billService = (BillService) context.getBean("billService");
        HashMap<String, Object> map = new HashMap<>();
        map.put("billCode","BILL2016_018");
        List<Bill> select = billService.select(map);
        for (Bill bill : select) {
            System.out.println(bill.toString());
        }
    }
}
