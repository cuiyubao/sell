package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

/**
 * User: cuiyubao
 * Date: 2019/3/4
 * Time: 下午 07:37
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
    @Autowired
    private ProductCategoryRepository repository;
    @Test
    public void findOneTest() {
        ProductCategory productCategory = repository.findOne(1);
        System.out.println(productCategory.toString());
    }
    @Test
    @Transactional //测试数据不会污染数据库
    public void saveTest() {
        ProductCategory productCategory = new ProductCategory("nan 生最爱", 6);
        ProductCategory result = repository.save(productCategory);
        Assert.assertNotNull(result);
//    Assert.assertNotEquals(null,result);
    }
    @Test
    public void findByCategoryTypeInTest() {
        List<Integer> list = Arrays.asList(2, 3, 4);
     List<ProductCategory> resule =  repository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0,resule.size());

    }

}