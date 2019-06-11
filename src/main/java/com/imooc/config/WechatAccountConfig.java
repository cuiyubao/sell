package com.imooc.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**微信账号相关
 * User: cuiyubao
 * Date: 2019/3/14
 * Time: 下午 08:57
 */
@Data
@Component
@ConfigurationProperties(prefix = "wechat")
public class WechatAccountConfig {
    /**
     * 公众平台id
     */
    private String mpAppId;
    /**
     * 公众平台密钥
     */
    private String mpAppSecret;
    /**
     * 开放平台id
     */
    private String openAppSecret;
    /**
     * 开放平台密钥
     */
    private String openAppId;
    /**
     * 商户号
     */
    private String mchId;
    /**
     * 商户密钥
     */
    private String mchKey;
    /**
     * 商户证书路径
     */
    private String keyPath;
    /**
     * 微信支付异步通知地址
     */
    private String notifyUrl;
}
