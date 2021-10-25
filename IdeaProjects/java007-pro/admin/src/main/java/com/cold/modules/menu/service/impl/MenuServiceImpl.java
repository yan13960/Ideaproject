package com.cold.modules.menu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cold.modules.menu.entity.MenuEntity;
import com.cold.modules.menu.mapper.MenuMapper;
import com.cold.modules.menu.service.IMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cold.util.R;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 
 * @since 2021-07-24
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, MenuEntity> implements IMenuService {

    @Override
    public R getMenu() {
        QueryWrapper<MenuEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("role",0);
        queryWrapper.orderByAsc("sort");
        List<MenuEntity> menuEntities = baseMapper.selectList(queryWrapper);
        return R.success().data(toTree(menuEntities));
    }

    private List<MenuEntity> toTree(List<MenuEntity> menus){
        List<MenuEntity> tree = new ArrayList<>();
        for (MenuEntity menu : menus) {
            if(menu.getPid()!=null && "0".equals(menu.getPid())){
                menu.setChildren(new ArrayList<>());
                tree.add(menu);
            }
        }
        for (MenuEntity menuEntity : tree) {
            for (MenuEntity menu : menus) {
                if(menuEntity.getId().equals(menu.getPid())){
                    menuEntity.getChildren().add(menu);
                }
            }
        }
        return tree;
    }
}
