package com.imooc.repository;

import com.imooc.dataobject.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

/**
 * User: cuiyubao
 * Date: 2019/3/7
 * Time: 下午 07:41
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest {
     @Autowired
     private  OrderMasterRepository repository;
     private final String  OPENID="110";
     @Test
     public  void saveTest(){
         OrderMaster orderMaster=new OrderMaster();
         orderMaster.setOrderId("12345467");
         orderMaster.setBuyerName("师兄");
         orderMaster.setBuyerPhone("12345678910");
         orderMaster.setBuyerAddress("慕课网");
         orderMaster.setBuyerOpenid("110");
         orderMaster.setOrderAmount(new BigDecimal(2.5));
         repository.save(orderMaster);
     }



    @Test
    public void findByBuyerOpenid() {

        PageRequest request=new PageRequest(1,3);

        Page<OrderMaster> result= repository.findByBuyerOpenid(OPENID,request);

        Assert.assertNotEquals(0,result.getTotalElements());
    }
}