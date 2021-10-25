package cn.itnanls.service;

import cn.itnanls.entity.OptLog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (OptLog)表服务接口
 *
 * @author makejava
 * @since 2021-10-16 17:59:23
 */
public interface OptLogService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OptLog queryById(Integer id);

    /**
     * 分页查询
     *
     * @param optLog      筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    Page<OptLog> queryByPage(OptLog optLog, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param optLog 实例对象
     * @return 实例对象
     */
    OptLog insert(OptLog optLog);

    /**
     * 修改数据
     *
     * @param optLog 实例对象
     * @return 实例对象
     */
    OptLog update(OptLog optLog);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}