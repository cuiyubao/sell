package com.imooc.form;

import com.imooc.enums.ProductStatusEnum;
import lombok.Data;

import java.math.BigDecimal;

/**
 * User: cuiyubao
 * Date: 2019/6/2
 * Time: 下午 10:49
 */
@Data
public class ProductForm {
    private String productId;

    /**
     * 商品名称
     */
    private String productName;
    /**
     * 单价
     */
    private BigDecimal productPrice;
    /**
     * 库存
     */
    private Integer productStock;
    /**
     * 描述
     */
    private String productDescription;
    /**
     * 小图
     */
    private String productIcon;
    /**
     * 状态
     */
    private Integer productStatus=ProductStatusEnum.UP.getCode();
    /**
     * 类目编号
     */
    private Integer categoryType;
}
