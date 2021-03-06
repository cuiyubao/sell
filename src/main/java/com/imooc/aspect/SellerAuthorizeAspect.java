package com.imooc.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

/**
 * User: cuiyubao
 * Date: 2019/6/11
 * Time: 下午 11:28
 */
@Aspect
@Component
@Slf4j
public class SellerAuthorizeAspect {
    @Autowired
    private StringRedisTemplate redisTemplate;

   @Pointcut("execution(public * com.imooc.controller.Seller*.*(..))" + "&& !execution(public * com.imooc.controller.SellerUserController.*(..))")
    public void verify() {
    }

//    @Before("verify()")
//    public void deVerify() {
//        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
//        HttpServletRequest request = attributes.getRequest();
//      //查询cookie
//        Cookie cookie=CookieUtil.get(request,CookieConstant.TOKEN);
//        if(cookie==null){
//           log.warn("[登录校验]Cookie中查不到token");
//           throw new SellerAuthorizeException();
//        }
//        //去redis里查询
//          String tokenValue=redisTemplate.opsForValue().get(String.format(RedisConstant.TOKEN_PREFIX,cookie.getValue()));
//        if(StringUtils.isEmpty(tokenValue)){
//            log.warn("[登录校验]redis中查不到token");
//            throw new SellerAuthorizeException();
//        }
//    }
}
