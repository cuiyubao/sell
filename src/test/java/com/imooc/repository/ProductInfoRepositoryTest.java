package com.imooc.repository;

import com.imooc.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * User: cuiyubao
 * Date: 2019/3/5
 * Time: 下午 08:50
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {
 @Autowired
 private ProductInfoRepository repository;

 @Test
 public void saveTest(){
     ProductInfo productInfo=new ProductInfo();
     productInfo.setProductId("123456");
     productInfo.setProductName("皮蛋粥");
     productInfo.setProductPrice(new BigDecimal(3.2));
     productInfo.setProductStock(100);
     productInfo.setProductDescription("很不错的粥");
     productInfo.setProductIcon("http://wwww.jpg");
     productInfo.setProductStatus(0);
     productInfo.setCategoryType(2);
    ProductInfo result= repository.save(productInfo);
     Assert.assertNotNull(result);
 }


    @Test
    public void findByProductStatus() {
        List<ProductInfo> result=repository.findByProductStatus(0);
        Assert.assertNotEquals(0,result.size());
    }
}