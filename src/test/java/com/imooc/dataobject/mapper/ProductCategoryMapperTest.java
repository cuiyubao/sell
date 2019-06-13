package com.imooc.dataobject.mapper;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

/**
 * User: cuiyubao
 * Date: 2019/6/13
 * Time: 下午 11:28
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Slf4j
public class ProductCategoryMapperTest {
   @Autowired
   private  ProductCategoryMapper mapper;
    @Test
    public void insertByMap() {
        Map<String,Object> map=new HashMap<>();
        map.put("category_name","师兄最不爱");
        map.put("category_type",101);
        int result=mapper.insertByMap(map);
        Assert.assertEquals(1,result);
    }
}