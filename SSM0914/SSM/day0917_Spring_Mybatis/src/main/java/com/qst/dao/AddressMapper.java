package com.qst.dao;

import com.qst.pojo.Address;

import java.util.HashMap;
import java.util.List;

/**
 * @Author: XiPeng
 * @Description:
 * @Date: Create in 16:07 2020/9/19
 * @Modified by:
 */
public interface AddressMapper {
    public int insert(Address address);
    public int update(Address address);
    public List<Address> select(HashMap<String,Object> map);
    public int delete(int id);
}
