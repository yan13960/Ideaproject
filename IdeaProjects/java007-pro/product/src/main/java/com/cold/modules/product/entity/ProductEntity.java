package com.cold.modules.product.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 商品基本信息表
 * </p>
 *
 * @author 
 * @since 2021-07-24
 */
@TableName("product")
public class ProductEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品所属类目ID
     */
    private Integer categoryId;

    /**
     * 商家ID
     */
    private Integer shopId;

    /**
     * 商品宣传图片列表，采用JSON数组格式
     */
    private String gallery;

    /**
     * 商品价格
     */
    private BigDecimal price;

    /**
     * 市场价格(一般高于当前价格) 也就是优惠前价格
     */
    private BigDecimal counterPrice;

    /**
     * 商品简介
     */
    private String brief;

    /**
     * 是否上架
     */
    private Boolean sale;

    /**
     * 商品页面商品图片
     */
    private String pic;

    /**
     * 商品单位，例如件、盒
     */
    private String unit;

    /**
     * 商品详细介绍，是富文本格式
     */
    private String detail;

    /**
     * 商品总库存（所有货品库存相加）
     */
    private Integer inventory;

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

    public ProductEntity setId(Integer id) {
        this.id = id;
        return this;
    }
    public String getName() {
        return name;
    }

    public ProductEntity setName(String name) {
        this.name = name;
        return this;
    }
    public Integer getCategoryId() {
        return categoryId;
    }

    public ProductEntity setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Integer getShopId() {
        return shopId;
    }

    public ProductEntity setShopId(Integer shopId) {
        this.shopId = shopId;
        return this;
    }
    public String getGallery() {
        return gallery;
    }

    public ProductEntity setGallery(String gallery) {
        this.gallery = gallery;
        return this;
    }
    public BigDecimal getPrice() {
        return price;
    }

    public ProductEntity setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }
    public BigDecimal getCounterPrice() {
        return counterPrice;
    }

    public ProductEntity setCounterPrice(BigDecimal counterPrice) {
        this.counterPrice = counterPrice;
        return this;
    }
    public String getBrief() {
        return brief;
    }

    public ProductEntity setBrief(String brief) {
        this.brief = brief;
        return this;
    }
    public Boolean getSale() {
        return sale;
    }

    public ProductEntity setSale(Boolean sale) {
        this.sale = sale;
        return this;
    }
    public String getPic() {
        return pic;
    }

    public ProductEntity setPic(String pic) {
        this.pic = pic;
        return this;
    }
    public String getUnit() {
        return unit;
    }

    public ProductEntity setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getDetail() {
        return detail;
    }

    public ProductEntity setDetail(String detail) {
        this.detail = detail;
        return this;
    }
    public Integer getInventory() {
        return inventory;
    }

    public ProductEntity setInventory(Integer inventory) {
        this.inventory = inventory;
        return this;
    }
    public Date getAddTime() {
        return addTime;
    }

    public ProductEntity setAddTime(Date addTime) {
        this.addTime = addTime;
        return this;
    }
    public Date getUpdateTime() {
        return updateTime;
    }

    public ProductEntity setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    @Override
    public String toString() {
        return "ProductEntity{" +
            "id=" + id +
            ", name=" + name +
            ", categoryId=" + categoryId +
            ", shopId=" + shopId +
            ", gallery=" + gallery +
            ", price=" + price +
            ", counterPrice=" + counterPrice +
            ", brief=" + brief +
            ", sale=" + sale +
            ", pic=" + pic +
            ", unit=" + unit +
            ", detail=" + detail +
            ", inventory=" + inventory +
            ", addTime=" + addTime +
            ", updateTime=" + updateTime +
        "}";
    }
}
