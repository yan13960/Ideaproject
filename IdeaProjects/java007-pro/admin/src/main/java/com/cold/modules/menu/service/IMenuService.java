package com.cold.modules.menu.service;

import com.cold.modules.menu.entity.MenuEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.cold.util.R;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 
 * @since 2021-07-24
 */
public interface IMenuService extends IService<MenuEntity> {

    /**
     * 查询菜单
     */
    R getMenu();

}
