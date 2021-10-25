package cn.itnanls.service.impl;

import cn.itnanls.dao.OptLogDao;
import cn.itnanls.entity.OptLog;
import cn.itnanls.service.OptLogService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * (OptLog)表服务实现类
 *
 * @author makejava
 * @since 2021-10-16 17:59:23
 */
@Service("optLogService")
public class OptLogServiceImpl implements OptLogService {
    @Resource
    private OptLogDao optLogDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public OptLog queryById(Integer id) {
        return this.optLogDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param optLog      筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @Override
    public Page<OptLog> queryByPage(OptLog optLog, PageRequest pageRequest) {
        long total = this.optLogDao.count(optLog);
        return new PageImpl<>(this.optLogDao.queryAllByLimit(optLog, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param optLog 实例对象
     * @return 实例对象
     */
    @Override
    @Transactional(propagation = Propagation.NESTED)
    public OptLog insert(OptLog optLog) {
        this.optLogDao.insert(optLog);
        return optLog;
    }

    /**
     * 修改数据
     *
     * @param optLog 实例对象
     * @return 实例对象
     */
    @Override
    public OptLog update(OptLog optLog) {
        this.optLogDao.update(optLog);
        return this.queryById(optLog.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.optLogDao.deleteById(id) > 0;
    }
}