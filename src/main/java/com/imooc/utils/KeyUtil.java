package com.imooc.utils;

import java.util.Random;

/**
 * User: cuiyubao
 * Date: 2019/3/11
 * Time: 上午 12:05
 */
public class KeyUtil {
    /**
     * 生成唯一的主键
     * 格式：时间+随机数
     * @return
     */
    public  static synchronized String getUniqueKey(){
        Random random=new Random();
        Integer number=random.nextInt(900000)+100000;//生成6位的随机小数
        return  System.currentTimeMillis()+String.valueOf(number);//时间精确到毫秒+6位随机数
    }
}
