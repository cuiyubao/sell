package com.imooc.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * User: cuiyubao
 * Date: 2019/3/23
 * Time: 下午 03:40
 */
public class JsonUtil {
    public  static String toJson(Object object){
        GsonBuilder gsonBuilder=new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson=gsonBuilder.create();
        return  gson.toJson(object);
    }
}
