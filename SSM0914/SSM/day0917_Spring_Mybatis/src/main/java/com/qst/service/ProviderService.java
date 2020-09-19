package com.qst.service;

import com.qst.pojo.Provider;

import java.util.HashMap;
import java.util.List;

/**
 * @Author: XiPeng
 * @Description:
 * @Date: Create in 20:01 2020/9/19
 * @Modified by:
 */
public interface ProviderService {
    public int insert(Provider provider);
    public int update(Provider provider);
    public int delete(int id);
    public List<Provider> select(HashMap<String,Object> map);
}
