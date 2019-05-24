package com.imooc.enums;

import lombok.Getter;

/**
 * User: cuiyubao
 * Date: 2019/3/7
 * Time: 下午 07:07
 */
@Getter
public enum PayStatusEnum implements CodeEnum {
    WAIT(0,"等待支付"),
    SUCCESS(1,"支付成功"),

    ;
    private  Integer code;
    private  String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
