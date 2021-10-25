package com.cold.modules.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cold.modules.product.entity.ProductEntity;
import com.cold.modules.product.mapper.ProductMapper;
import com.cold.modules.product.service.IProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cold.util.R;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 商品基本信息表 服务实现类
 * </p>
 *
 * @author 
 * @since 2021-07-24
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, ProductEntity> implements IProductService {

    @Resource
   ProductMapper productMapper;

    @Override
    public R page() {
        List<ProductEntity> productEntities = productMapper.selectList(new QueryWrapper<>());
        return R.success("操作成功",productEntities);
    }
}
