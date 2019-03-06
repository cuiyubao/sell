package com.imooc.VO;

import lombok.Data;

/**http请求返回的最外层的对象
 * User: cuiyubao
 * Date: 2019/3/6
 * Time: 下午 08:06
 */
@Data
public class ResultVO<T> {
    /**
     * 错误码
     */
    private Integer code;
    /**
     * 提示信息
     */
    private String msg;
    /**
     * 具体内容
     */
    private T data;

}
