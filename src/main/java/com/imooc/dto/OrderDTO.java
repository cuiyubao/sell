package com.imooc.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.imooc.dataobject.OrderDetail;
import com.imooc.utils.serializer.Date2LongSerializer;
import lombok.Data;

import javax.persistence.Transient;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * User: cuiyubao
 * Date: 2019/3/10
 * Time: 下午 11:12
 */
@Data
//@JsonInclude(JsonInclude.Include.NON_NULL) //限制空字段不返回
public class OrderDTO {

    /**
     *订单id
     */
    private String orderId;
    /**
     *买家名字
     */
    private String buyerName;
    /**
     *买家电话
     */
    private String buyerPhone;
    /**
     *买家地址
     */
    private String buyerAddress;
    /**
     *买家微信openid
     */
    private String buyerOpenid;
    /**
     *订单总金额
     */
    private BigDecimal orderAmount;
    /**
     *订单状态，默认0新下单
     */
    private Integer orderStatus;
    /**
     *支付状态，默认0未支付
     */
    private Integer payStatus;
    /**
     *创建时间
     */
    @JsonSerialize(using=Date2LongSerializer.class)
    private Date createTime;
    /**
     *修改时间
     */
    @JsonSerialize(using=Date2LongSerializer.class)
    private Date updateTime;

    @Transient//和数据库对应的时候忽略这个字段
    private List<OrderDetail> orderDetailList;

}
