package com.imooc.exception;

import com.imooc.enums.ResultEnum;
import lombok.Getter;

/**
 * User: cuiyubao
 * Date: 2019/3/10
 * Time: 下午 11:49
 */
@Getter
public class SellException extends RuntimeException{
    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code=resultEnum.getCode();
    }
    public SellException(Integer code,String message) {
        super(message);
        this.code=code;
    }

}
