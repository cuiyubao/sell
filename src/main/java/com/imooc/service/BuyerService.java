package com.imooc.service;

import com.imooc.dto.OrderDTO;

/**买家
 * User: cuiyubao
 * Date: 2019/3/13
 * Time: 下午 11:27
 */
public interface BuyerService {
//查询一个订单

    OrderDTO findOrderOne(String openid,String orderid);

    //取消订单

    OrderDTO cancelOrder(String openid,String orderid);

}
