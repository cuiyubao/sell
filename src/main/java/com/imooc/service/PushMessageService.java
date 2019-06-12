package com.imooc.service;

import com.imooc.dto.OrderDTO;

/**推送消息
 * User: cuiyubao
 * Date: 2019/6/12
 * Time: 下午 09:34
 */
public interface PushMessageService {

    /**
     * 订单状态变更消息
     * @param orderDTO
     */
    void orderStatus(OrderDTO orderDTO);
}
