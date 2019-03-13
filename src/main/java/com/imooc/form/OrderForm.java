package com.imooc.form;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * User: cuiyubao
 * Date: 2019/3/13
 * Time: 下午 07:39
 */
@Data
public class OrderForm {
    /**
     * 买家姓名
     */
    @NotEmpty(message = "姓名必填")
    private String name;
    /**
     * 买家手机号
     */
    @NotEmpty(message = "手机号必填")
    private String phone;
    /**
     * 买家openid
     */
    @NotEmpty(message = "openid必填")
    private String openid;
    /**
     * 买家地址
     */
    @NotEmpty(message = "地址必填")
    private String address;
    /**
     * 购物车
     */
    @NotEmpty(message = "购物车不能为空")
    private String items;


}
