package com.cold.modules.admin.service;

import com.cold.modules.admin.entity.AdminEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.cold.util.P;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 
 * @since 2021-07-24
 */
public interface IAdminService extends IService<AdminEntity> {

    AdminEntity check(P p);

}
