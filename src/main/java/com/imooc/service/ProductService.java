package com.imooc.service;

import com.imooc.dataobject.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * User: cuiyubao
 * Date: 2019/3/5
 * Time: 下午 09:11
 */
public interface ProductService {
    ProductInfo findOne(String productId );

    /**
     * 查询所有在架商品列表
     * @return
     */
    List<ProductInfo> findUpAll();



    Page<ProductInfo> findAll(Pageable pageable );

    ProductInfo save(ProductInfo productInfo);

    //减库存

    //加库存


}
