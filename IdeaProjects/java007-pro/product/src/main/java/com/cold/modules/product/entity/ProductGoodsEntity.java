package com.cold.modules.product.entity;

import java.math.BigDecimal;
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
@TableName("product_goods")
public class ProductGoodsEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer productId;

    /**
     * 商品规格值列表，采用JSON数组格式
     */
    private String specifications;

    /**
     * 商品货品价格
     */
    private BigDecimal price;

    /**
     * 商品货品库存量
     */
    private Integer number;

    private Date addTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public ProductGoodsEntity setId(Integer id) {
        this.id = id;
        return this;
    }
    public Integer getProductId() {
        return productId;
    }

    public ProductGoodsEntity setProductId(Integer productId) {
        this.productId = productId;
        return this;
    }
    public String getSpecifications() {
        return specifications;
    }

    public ProductGoodsEntity setSpecifications(String specifications) {
        this.specifications = specifications;
        return this;
    }
    public BigDecimal getPrice() {
        return price;
    }

    public ProductGoodsEntity setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }
    public Integer getNumber() {
        return number;
    }

    public ProductGoodsEntity setNumber(Integer number) {
        this.number = number;
        return this;
    }
    public Date getAddTime() {
        return addTime;
    }

    public ProductGoodsEntity setAddTime(Date addTime) {
        this.addTime = addTime;
        return this;
    }
    public Date getUpdateTime() {
        return updateTime;
    }

    public ProductGoodsEntity setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    @Override
    public String toString() {
        return "ProductGoodsEntity{" +
            "id=" + id +
            ", productId=" + productId +
            ", specifications=" + specifications +
            ", price=" + price +
            ", number=" + number +
            ", addTime=" + addTime +
            ", updateTime=" + updateTime +
        "}";
    }
}
