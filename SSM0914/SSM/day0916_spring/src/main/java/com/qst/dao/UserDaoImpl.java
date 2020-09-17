package com.qst.dao;

import com.qst.pojo.User;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

/**
 * @Author: XiPeng
 * @Description:
 * @Date: Create in 15:20 2020/9/16
 * @Modified by:
 */
@Repository(value = "userDao")
public class UserDaoImpl implements UserDao {
    Logger logger = Logger.getLogger(UserDaoImpl.class);
    public int save(User user) {
        logger.info(user.getUserName()+"=========="+user.getPassWord());
        return 1;
    }
}
