package com.cold.modules.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cold.modules.admin.entity.AdminEntity;
import com.cold.modules.admin.mapper.AdminMapper;
import com.cold.modules.admin.service.IAdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cold.util.P;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 
 * @since 2021-07-24
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, AdminEntity> implements IAdminService {

    @Resource
    AdminMapper adminMapper;

    @Override
    public AdminEntity check(P p) {
        QueryWrapper<AdminEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("admin_name",p.getString("adminName"));
        AdminEntity adminEntity = adminMapper.selectOne(queryWrapper);
        if (adminEntity == null) {
            return null;
        }
        return adminEntity;
    }
}
