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
@TableName("product_attribute")
public class ProductAttributeEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 商品ID
     */
    private Integer productId;

    /**
     * 商品参数名称
     */
    private String name;

    /**
     * 商品参数值
     */
    private String value;

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

    public ProductAttributeEntity setId(Integer id) {
        this.id = id;
        return this;
    }
    public Integer getProductId() {
        return productId;
    }

    public ProductAttributeEntity setProductId(Integer productId) {
        this.productId = productId;
        return this;
    }
    public String getName() {
        return name;
    }

    public ProductAttributeEntity setName(String name) {
        this.name = name;
        return this;
    }
    public String getValue() {
        return value;
    }

    public ProductAttributeEntity setValue(String value) {
        this.value = value;
        return this;
    }
    public Date getAddTime() {
        return addTime;
    }

    public ProductAttributeEntity setAddTime(Date addTime) {
        this.addTime = addTime;
        return this;
    }
    public Date getUpdateTime() {
        return updateTime;
    }

    public ProductAttributeEntity setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    @Override
    public String toString() {
        return "ProductAttributeEntity{" +
            "id=" + id +
            ", productId=" + productId +
            ", name=" + name +
            ", value=" + value +
            ", addTime=" + addTime +
            ", updateTime=" + updateTime +
        "}";
    }
}
