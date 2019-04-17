package com.imooc.service;

import com.google.gson.JsonIOException;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.imooc.dataobject.OrderMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.util.ResourceUtils;

import java.io.*;
import java.lang.reflect.Field;

/**
 * User: cuiyubao
 * Date: 2019/3/6
 * Time: 下午 04:47
 */
public class Test {
    @Autowired
    private ResourceLoader resourceLoader;
    /**
     * @param orderMaster  对象
     * @param propertyName 属性名
     * @param qtySum       要插入的值
     * @description:根据属性名调用set方法
     */
    public static void dynamicSet(OrderMaster orderMaster, String propertyName, Object qtySum) {
        try {
            Field field = orderMaster.getClass().getDeclaredField(propertyName);
            field.setAccessible(true);
            field.set(orderMaster, qtySum);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void  test(){
        JsonParser parse = new JsonParser();  //创建json解析器
        try {
//            Resource resource = resourceLoader.getResource("classpath:aa.json");
//            Resource resource = resourceLoader.getResource("aa.json");
//            Resource resource = new ClassPathResource("aa.json");
            File file1 = ResourceUtils.getFile("classpath:aa.json");
//            File file = resource.getFile();
//            BufferedReader br = new BufferedReader(new InputStreamReader(resource.getInputStream()));
            System.out.println(file1);
//            JsonObject json = (JsonObject) parse.parse(new FileReader(file));  //创建jsonObject对象
//
//            System.out.println("weather:" +parse);


        } catch (JsonIOException e) {
            e.printStackTrace();
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
//        OrderMaster orderMaster =new OrderMaster();
//        orderMaster.setOrderId("8888");
//        String proper="payStatus";
//        dynamicSet(orderMaster,proper,2);
//        System.out.println(orderMaster);
//        Map<String, String> map=new HashMap();
//        map.put("1","1ss");
//        map.put("2","2ss");
//        map.put("3","3ss");
//        map.put("4","4ss");
//        for (Map.Entry<String, String> entry : map.entrySet()) {
//            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
//        }
        Test  aa=new Test();
        aa.test();
    }


}


