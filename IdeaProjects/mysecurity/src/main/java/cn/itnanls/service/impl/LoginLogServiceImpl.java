package cn.itnanls.service.impl;

import cn.itnanls.dao.LoginLogDao;
import cn.itnanls.entity.LoginLog;
import cn.itnanls.service.LoginLogService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (LoginLog)表服务实现类
 *
 * @author makejava
 * @since 2021-10-16 17:59:22
 */
@Service("loginLogService")
public class LoginLogServiceImpl implements LoginLogService {
    @Resource
    private LoginLogDao loginLogDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public LoginLog queryById(Integer id) {
        return this.loginLogDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param loginLog    筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @Override
    public Page<LoginLog> queryByPage(LoginLog loginLog, PageRequest pageRequest) {
        long total = this.loginLogDao.count(loginLog);
        return new PageImpl<>(this.loginLogDao.queryAllByLimit(loginLog, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param loginLog 实例对象
     * @return 实例对象
     */
    @Override
    public LoginLog insert(LoginLog loginLog) {
        this.loginLogDao.insert(loginLog);
        return loginLog;
    }

    /**
     * 修改数据
     *
     * @param loginLog 实例对象
     * @return 实例对象
     */
    @Override
    public LoginLog update(LoginLog loginLog) {
        this.loginLogDao.update(loginLog);
        return this.queryById(loginLog.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.loginLogDao.deleteById(id) > 0;
    }
}