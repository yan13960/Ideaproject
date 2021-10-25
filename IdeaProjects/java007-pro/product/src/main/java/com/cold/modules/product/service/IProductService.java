package com.cold.modules.product.service;

import com.cold.modules.product.entity.ProductEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.cold.util.R;

/**
 * <p>
 * 商品基本信息表 服务类
 * </p>
 *
 * @author 
 * @since 2021-07-24
 */
public interface IProductService extends IService<ProductEntity> {
 R page();
}
