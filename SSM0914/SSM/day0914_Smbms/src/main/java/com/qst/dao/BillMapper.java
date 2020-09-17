package com.qst.dao;

import com.qst.pojo.Bill;
import com.qst.pojo.User;

import java.util.List;

/**
 * @Author: XiPeng
 * @Description:
 * @Date: Create in 21:06 2020/9/15
 * @Modified by:
 */
public interface BillMapper {
    List<Bill> getAll(Bill bill);
}
