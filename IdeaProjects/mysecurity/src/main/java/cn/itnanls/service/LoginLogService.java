package cn.itnanls.service;

import cn.itnanls.entity.LoginLog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (LoginLog)表服务接口
 *
 * @author makejava
 * @since 2021-10-16 17:59:22
 */
public interface LoginLogService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    LoginLog queryById(Integer id);

    /**
     * 分页查询
     *
     * @param loginLog    筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    Page<LoginLog> queryByPage(LoginLog loginLog, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param loginLog 实例对象
     * @return 实例对象
     */
    LoginLog insert(LoginLog loginLog);

    /**
     * 修改数据
     *
     * @param loginLog 实例对象
     * @return 实例对象
     */
    LoginLog update(LoginLog loginLog);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}