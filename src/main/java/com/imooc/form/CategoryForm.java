package com.imooc.form;

import lombok.Data;

import javax.persistence.GeneratedValue;

/**
 * User: cuiyubao
 * Date: 2019/6/3
 * Time: 上午 12:13
 */
@Data
public class CategoryForm {
    /**
     *类目id
     */
    @GeneratedValue//自增
    private Integer categoryId;
    /**
     * 类目名称
     */
    private String categoryName;
    /**
     * 类目类别
     */
    private Integer categoryType;
}
