package com.imooc.exception;

import com.imooc.enums.ResultEnum;

/**
 * User: cuiyubao
 * Date: 2019/3/10
 * Time: 下午 11:49
 */
public class SellException extends RuntimeException{
    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code=resultEnum.getCode();
    }
}
