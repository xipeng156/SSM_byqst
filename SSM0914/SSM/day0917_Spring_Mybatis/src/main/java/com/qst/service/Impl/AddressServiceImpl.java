package com.qst.service.Impl;

import com.qst.dao.AddressMapper;
import com.qst.pojo.Address;
import com.qst.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * @Author: XiPeng
 * @Description:
 * @Date: Create in 16:24 2020/9/19
 * @Modified by:
 */
@Service("addressService")
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressMapper addressMapper;
    @Override
    public int insert(Address address) {
        return addressMapper.insert(address);
    }

    @Override
    public int update(Address address) {
        return addressMapper.update(address);
    }

    @Override
    public List<Address> select(HashMap<String, Object> map) {
        return addressMapper.select(map);
    }


    @Override
    public int delete(int id) {
        return addressMapper.delete(id);
    }
}
