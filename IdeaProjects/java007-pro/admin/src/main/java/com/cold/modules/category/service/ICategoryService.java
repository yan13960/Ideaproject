package com.cold.modules.category.service;

import com.cold.modules.category.entity.CategoryEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.cold.util.R;

/**
 * <p>
 * 类目表 服务类
 * </p>
 *
 * @author 
 * @since 2021-07-24
 */
public interface ICategoryService extends IService<CategoryEntity> {

    R categoryList();

}
