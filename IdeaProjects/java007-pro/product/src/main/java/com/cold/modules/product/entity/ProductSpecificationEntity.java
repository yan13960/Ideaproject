package com.cold.modules.product.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 
 * @since 2021-07-24
 */
@TableName("product_specification")
public class ProductSpecificationEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer productId;

    /**
     * 商品规格名称
     */
    private String name;

    /**
     * 商品规格值
     */
    private String value;

    /**
     * 商品规格图片
     */
    private String url;

    /**
     * 创建时间
     */
    private Date addTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public ProductSpecificationEntity setId(Integer id) {
        this.id = id;
        return this;
    }
    public Integer getProductId() {
        return productId;
    }

    public ProductSpecificationEntity setProductId(Integer productId) {
        this.productId = productId;
        return this;
    }
    public String getName() {
        return name;
    }

    public ProductSpecificationEntity setName(String name) {
        this.name = name;
        return this;
    }
    public String getValue() {
        return value;
    }

    public ProductSpecificationEntity setValue(String value) {
        this.value = value;
        return this;
    }
    public String getUrl() {
        return url;
    }

    public ProductSpecificationEntity setUrl(String url) {
        this.url = url;
        return this;
    }
    public Date getAddTime() {
        return addTime;
    }

    public ProductSpecificationEntity setAddTime(Date addTime) {
        this.addTime = addTime;
        return this;
    }
    public Date getUpdateTime() {
        return updateTime;
    }

    public ProductSpecificationEntity setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    @Override
    public String toString() {
        return "ProductSpecificationEntity{" +
            "id=" + id +
            ", productId=" + productId +
            ", name=" + name +
            ", value=" + value +
            ", url=" + url +
            ", addTime=" + addTime +
            ", updateTime=" + updateTime +
        "}";
    }
}
