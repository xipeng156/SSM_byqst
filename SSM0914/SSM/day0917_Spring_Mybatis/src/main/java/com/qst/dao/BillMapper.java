package com.qst.dao;

import com.qst.pojo.Bill;

import java.util.HashMap;
import java.util.List;

/**
 * @Author: XiPeng
 * @Description:
 * @Date: Create in 17:30 2020/9/19
 * @Modified by:
 */
public interface BillMapper {
    public int insert(Bill bill);
    public int update(Bill bill);
    public int delete(int id);
    public List<Bill> select(HashMap<String,Object> map);
}
