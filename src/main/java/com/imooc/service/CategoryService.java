package com.imooc.service;

import com.imooc.dataobject.ProductCategory;

import java.util.List;

/**
 * User: cuiyubao
 * Date: 2019/3/4
 * Time: 下午 09:14
 */
public interface CategoryService {

    ProductCategory findOne(Integer CategoryId);

    List<ProductCategory> findAll();

    List<ProductCategory>  findByCategoryTypeIn(List<Integer> categoryTypeList );

    ProductCategory save(ProductCategory productCategory);

}
