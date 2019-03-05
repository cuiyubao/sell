package com.imooc.repository;

import com.imooc.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * User: cuiyubao
 * Date: 2019/3/5
 * Time: 下午 08:47
 */
public interface ProductInfoRepository  extends JpaRepository<ProductInfo,String > {
     List<ProductInfo> findByProductStatus(Integer productStatus);
}
