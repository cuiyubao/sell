package com.imooc.service.impl;

import com.imooc.dto.OrderDTO;
import com.imooc.service.PayService;
import com.lly835.bestpay.service.impl.BestPayServiceImpl;

/**
 * User: cuiyubao
 * Date: 2019/3/17
 * Time: 下午 11:44
 */
public class PayServiceImpl implements PayService {
    @Override
    public void create(OrderDTO orderDTO) {
        BestPayServiceImpl bestPayService=new BestPayServiceImpl();
//        bestPayService.
    }
}
