package com.imooc.service;

import java.util.Date;

/**
 * User: cuiyubao
 * Date: 2019/3/6
 * Time: 下午 04:47
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
//        Map map=new HashMap<>();
//        map.put("","12");
//        map.put("","13");
//        map.size();
//        System.out.println(map.size());
//        System.out.println(map);

        Date startTime=new Date();
        System.out.println("strarTime:"+startTime);
        Thread.sleep(1080);
        Date endTime=new Date();
        System.out.println("endTime:"+endTime);
        System.out.println(endTime.getTime()-startTime.getTime());
        startTime=endTime;
        System.out.println("strarTime:"+startTime);


    }
    
}
