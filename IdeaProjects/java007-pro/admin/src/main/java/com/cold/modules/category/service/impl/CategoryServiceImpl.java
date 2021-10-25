package com.cold.modules.category.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cold.modules.category.entity.CategoryEntity;
import com.cold.modules.category.mapper.CategoryMapper;
import com.cold.modules.category.service.ICategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cold.util.R;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 类目表 服务实现类
 * </p>
 *
 * @author 
 * @since 2021-07-24
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, CategoryEntity> implements ICategoryService {

    @Override
    public R categoryList() {
        return R.success().data(baseMapper.selectList(new QueryWrapper<CategoryEntity>()));
    }
}
