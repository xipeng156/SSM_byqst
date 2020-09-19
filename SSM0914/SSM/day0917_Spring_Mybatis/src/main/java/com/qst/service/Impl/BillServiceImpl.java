package com.qst.service.Impl;

import com.qst.dao.BillMapper;
import com.qst.pojo.Bill;
import com.qst.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * @Author: XiPeng
 * @Description:
 * @Date: Create in 18:54 2020/9/19
 * @Modified by:
 */
@Service("billService")
public class BillServiceImpl implements BillService {
    @Autowired
    BillMapper billMapper;
    @Override
    public int insert(Bill bill) {
        return billMapper.insert(bill);
    }

    @Override
    public int update(Bill bill) {
        return billMapper.update(bill);
    }

    @Override
    public int delete(int id) {
        return billMapper.delete(id);
    }

    @Override
    public List<Bill> select(HashMap<String, Object> map) {
        return billMapper.select(map);
    }
}
