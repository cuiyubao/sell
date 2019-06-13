package com.imooc.handler;

import com.imooc.VO.ResultVO;
import com.imooc.config.ProjectUrlConfig;
import com.imooc.exception.SellException;
import com.imooc.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * User: cuiyubao
 * Date: 2019/6/11
 * Time: 下午 11:48
 */
@ControllerAdvice
public class SellExceptionHandler {
    @Autowired
    private ProjectUrlConfig projectUrlConfig;
    //拦截登录异常
    @ExceptionHandler(value = SecurityException.class)
    public ModelAndView handlerAuthorizeException(){
        return new ModelAndView("redirect".
                concat(projectUrlConfig.getWechatOpenAuthorize()).
                concat("/sell/wechat/qrAuthorize").
                concat("?returnUrl=").concat(projectUrlConfig.getSell().concat("/sell/seller/login")));


    }

    @ExceptionHandler(value = SellException.class)
    @ResponseBody
    public ResultVO handlerSellerException(SellException e){
        return ResultVOUtil.error(e.getCode(),e.getMessage());
    }

}
