package com.imooc.controller;

import com.imooc.dto.OrderDTO;
import com.imooc.enums.ResultEnum;
import com.imooc.exception.SellException;
import com.imooc.service.OrderService;
import com.imooc.service.PayService;
import com.lly835.bestpay.model.PayResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * User: cuiyubao
 * Date: 2019/3/17
 * Time: 下午 11:38
 */
@Controller
@RequestMapping("/pay")
public class PayController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private PayService payService;

    @GetMapping("/create")
    public ModelAndView create(@RequestParam("orderId") String orderId,
                               @RequestParam("returnUrl") String returnUrl,
                               Map<String,Object> map) {

//        1.查询订单
        OrderDTO orderDTO=orderService.findOne(orderId);
        if (orderDTO==null){
            throw new SellException(ResultEnum.ORDER_NOT_EXIST);
        }



        //2 发起支付
       PayResponse payResponse= payService.create(orderDTO);
           map.put("payResponse",payResponse);
           map.put("returnUrl",returnUrl);
        return  new ModelAndView("pay/create",map);



    }

}
