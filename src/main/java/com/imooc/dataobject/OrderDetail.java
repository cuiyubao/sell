package com.imooc.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单详情表
 * User: cuiyubao
 * Date: 2019/3/7
 * Time: 下午 07:11
 */
@Entity
@Data
@DynamicUpdate//动态更新时间
public class OrderDetail {

    @Id
    private String detailId;

    /**
     * 订单ID
     */
    private String orderId;
    /**
     * 商品id
     */
    private String productId;
    /**
     * 商品名称
     */
    private String productName;
    /**
     * 商品价格
     */
    private BigDecimal productPrice;
    /**
     * 商品数量
     */
    private Integer productQuantity;
    /**
     * 商品小图
     */
    private String productIcon;
    /**
     * 开始时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;


}
