package com.imooc.service.impl;

import com.imooc.dto.OrderDTO;
import com.imooc.service.OrderService;
import com.imooc.service.PayService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * User: cuiyubao
 * Date: 2019/3/23
 * Time: 下午 01:40
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class PayServiceImplTest {
    @Autowired
    private PayService  payService;

    @Autowired
    private OrderService orderService;

    @Test
    public void create() {

        OrderDTO orderDTO=orderService.findOne("1552480842772987392");
        payService.create(orderDTO);
    }
}