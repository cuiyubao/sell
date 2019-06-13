package com.imooc.dataobject.mapper;

import org.apache.ibatis.annotations.Insert;

import java.util.Map;

/**
 * User: cuiyubao
 * Date: 2019/6/13
 * Time: 下午 11:23
 */

public interface ProductCategoryMapper {

    @Insert("insert into product_category(category_name,category_type) values(#{category_name,jdbcType=VARCHAR},#{category_type,jdbcType=INTEGER})")
    int insertByMap(Map<String,Object> map);

}
