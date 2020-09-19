package com.qst.service.Impl;

import com.qst.dao.ProviderMapper;
import com.qst.pojo.Provider;
import com.qst.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * @Author: XiPeng
 * @Description:
 * @Date: Create in 20:01 2020/9/19
 * @Modified by:
 */
@Service("providerService")
public class ProviderServiceImpl implements ProviderService {
    @Autowired
    ProviderMapper providerMapper;
    @Override
    public int insert(Provider provider) {
        return providerMapper.insert(provider);
    }

    @Override
    public int update(Provider provider) {
        return providerMapper.update(provider);
    }

    @Override
    public int delete(int id) {
        return providerMapper.delete(id);
    }

    @Override
    public List<Provider> select(HashMap<String, Object> map) {
        return providerMapper.select(map);
    }
}
