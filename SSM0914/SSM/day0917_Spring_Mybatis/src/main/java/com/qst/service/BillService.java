package com.qst.service;

import com.qst.pojo.Bill;

import java.util.HashMap;
import java.util.List;

/**
 * @Author: XiPeng
 * @Description:
 * @Date: Create in 18:54 2020/9/19
 * @Modified by:
 */
public interface BillService {
    public int insert(Bill bill);
    public int update(Bill bill);
    public int delete(int id);
    public List<Bill> select(HashMap<String,Object> map);
}
