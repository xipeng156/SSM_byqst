package com.qst.dao;

import com.qst.pojo.Provider;

import java.util.HashMap;
import java.util.List;

/**
 * @Author: XiPeng
 * @Description:
 * @Date: Create in 17:30 2020/9/19
 * @Modified by:
 */
public interface ProviderMapper {
    public int insert(Provider provider);
    public int update(Provider provider);
    public int delete(int id);
    public List<Provider> select(HashMap<String,Object> map);
}
