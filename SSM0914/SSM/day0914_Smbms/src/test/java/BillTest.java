import com.qst.dao.BillMapper;
import com.qst.pojo.Bill;
import com.qst.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @Author: XiPeng
 * @Description:
 * @Date: Create in 8:27 2020/9/16
 * @Modified by:
 */
public class BillTest {
    @org.junit.Test
    public void getAll(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        Bill bill = new Bill();
        bill.setProductName("大豆");
        List<Bill> all = sqlSession.getMapper(BillMapper.class).getAll(bill);
        for (Bill bill1 : all) {
            System.out.println(bill1);
        }
    }
}
