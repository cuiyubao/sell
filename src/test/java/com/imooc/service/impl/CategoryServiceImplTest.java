package com.imooc.service.impl;

import com.imooc.dataobject.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * User: cuiyubao
 * Date: 2019/3/4
 * Time: 下午 09:23
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {
@Autowired
private CategoryServiceImpl categoryService;

    @Test
    public void findOne() {
        ProductCategory productCategory=categoryService.findOne(1);
//        Assert.assertEquals(1,productCategory.getCategoryId());
    }

    @Test
    public void findAll() {
    }

    @Test
    public void findByCategoryTypeIn() {
    }

    @Test
    public void save() {
    }
}