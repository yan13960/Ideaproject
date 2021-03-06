package cn.itnanls.service.impl;

import cn.itnanls.dao.PermissionDao;
import cn.itnanls.entity.Permission;
import cn.itnanls.service.PermissionService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Permission)表服务实现类
 *
 * @author makejava
 * @since 2021-10-10 16:01:37
 */
@Service("permissionService")
public class PermissionServiceImpl implements PermissionService {
    @Resource
    private PermissionDao permissionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Permission queryById(Integer id) {
        return this.permissionDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param permission  筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @Override
    public Page<Permission> queryByPage(Permission permission, PageRequest pageRequest) {
        long total = this.permissionDao.count(permission);
        return new PageImpl<>(this.permissionDao.queryAllByLimit(permission, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param permission 实例对象
     * @return 实例对象
     */
    @Override
    public Permission insert(Permission permission) {
        this.permissionDao.insert(permission);
        return permission;
    }

    /**
     * 修改数据
     *
     * @param permission 实例对象
     * @return 实例对象
     */
    @Override
    public Permission update(Permission permission) {
        this.permissionDao.update(permission);
        return this.queryById(permission.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.permissionDao.deleteById(id) > 0;
    }

    @Override
    public List<Permission> getPermissionsByUserId(Integer uid) {
        return permissionDao.getPermissionsByUserId(uid);
    }


    @Override
    public List<Permission> getPermissionsByUserName(String username) {
        return permissionDao.getPermissionsByUserName(username);
    }

    @Override
    public void allocation(Integer rId, Integer pId) {
        permissionDao.allocation( rId, pId);
    }
}