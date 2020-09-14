package com.qst.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.qst.entity.JsonUsers;
import com.qst.entity.Users;

import java.util.List;

public class GetJson {
    public String setStatus(Object users){
        /**
         * fastjson提供的JSON.toJSONString(...)有很多重载的方法，例如：
         *     public static String toJSONString(Object object,
         *     SerializeConfig config, SerializerFeature... features)
         *   所以，fastjson可以通过设置SerializeConfig来配置enum的序列化。
         */
        SerializeConfig serializeConfig = new SerializeConfig();
        serializeConfig.configEnumAsJavaBean(new Class[]{users.getClass()});
        String s = JSON.toJSONString(users,serializeConfig);
        System.out.println(s);
        return s;
    }

}
