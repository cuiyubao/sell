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

    private String mpAppId;
    private String mpAppSecret;

}
