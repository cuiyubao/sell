package com.imooc.repository;

import com.imooc.dataobject.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

/**
 * User: cuiyubao
 * Date: 2019/3/7
 * Time: 下午 07:57
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {
    @Autowired
    private OrderDetailRepository repository;

    @Test
    public void save() {
        OrderDetail orderDetail =new OrderDetail();
        orderDetail.setDetailId("123456710");
        orderDetail.setOrderId("11111");
        orderDetail.setProductId("11111");
        orderDetail.setProductIcon("http://xxxx.jpg");
        orderDetail.setProductName("皮蛋");
        orderDetail.setProductPrice(new BigDecimal(6.5));
        orderDetail.setProductQuantity(3);

       OrderDetail result= repository.save(orderDetail);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByOrOrderId() {
        List<OrderDetail> orderDetailList= repository.findByOrOrderId("11111");
        Assert.assertNotEquals(0,orderDetailList.size());
    }
}