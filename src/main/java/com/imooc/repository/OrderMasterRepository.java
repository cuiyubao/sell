package com.imooc.repository;

import com.imooc.dataobject.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
/**
 * User: cuiyubao
 * Date: 2019/3/7
 * Time: 下午 07:19
 */
public interface OrderMasterRepository  extends JpaRepository<OrderMaster,String> {
    /**
     * 通过买家的openid来查询订单  并且有分页
     * @param buyerOpenid
     * @param pageable
     * @return
     */
 Page<OrderMaster> findByBuyerOpenid(String buyerOpenid,Pageable pageable);


}
