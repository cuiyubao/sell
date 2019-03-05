package com.imooc.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


/**类目表
 * User: cuiyubao
 * Date: 2019/3/4
 * Time: 下午 07:20
 */
@Table(name="product_category")//当表名和类名不一致的时候使用这一个注解
@Entity//数据库映射
@DynamicUpdate//动态更新时间
@Data//lombok  自动生成get set toString方法
public class ProductCategory {
    /**
     *类目id
     */
    @Id//主键ID
    @GeneratedValue//自增
    private Integer categoryId;
    /**
     * 类目名称
     */
    private String categoryName;
    /**
     * 类目类别
     */
    private Integer categoryType;
    private Date createTime;

    private Date updateTime;

    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
