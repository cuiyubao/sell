package com.imooc.service;

import com.imooc.dataobject.SellerInfo;

/**
 * User: cuiyubao
 * Date: 2019/6/3
 * Time: 下午 10:21
 */
public interface SellerService {
    /**
     * 通过openid查询
     * @param openid
     * @return
     */
    SellerInfo findSellerInfoByOpenid(String openid);
}
