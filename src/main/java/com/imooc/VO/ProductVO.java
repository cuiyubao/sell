package com.imooc.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * 商品（包含类目）
 * User: cuiyubao
 * Date: 2019/3/6
 * Time: 下午 08:16
 */
@Data
public class ProductVO {

    @JsonProperty("name")//对象序列化的时候返回前端的就是name
    private  String categoryName;
    @JsonProperty("type")
    private  Integer categoryType;
    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;


}
