package com.imooc.service;

import com.imooc.dto.OrderDTO;
import com.lly835.bestpay.model.PayResponse;

/**
 * User: cuiyubao
 * Date: 2019/3/17
 * Time: 下午 11:44
 */
public interface PayService {
    PayResponse create(OrderDTO orderDTO);
    PayResponse notify(String notifyData);

}
