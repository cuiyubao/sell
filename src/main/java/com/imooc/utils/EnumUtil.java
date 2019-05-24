package com.imooc.utils;

import com.imooc.enums.CodeEnum;

/**
 * User: cuiyubao
 * Date: 2019/5/24
 * Time: 上午 12:27
 */
public class EnumUtil {
    public static<T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass){
       for(T each: enumClass.getEnumConstants()){
           if(code.equals(each.getCode())){
               return each;
           }
       }
       return null;
    }
}
