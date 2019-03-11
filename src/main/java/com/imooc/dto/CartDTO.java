package com.imooc.dto;

import lombok.Data;

/**
 * 购物车
 * User: cuiyubao
 * Date: 2019/3/11
 * Time: 下午 06:27
 */
@Data
public class CartDTO {
    /**
     * 商品id
     */
    private String productId;
    /**
     * 商品数量
     */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}

