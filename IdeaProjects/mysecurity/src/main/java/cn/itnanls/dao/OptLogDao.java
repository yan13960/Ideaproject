package cn.itnanls.dao;

import cn.itnanls.entity.OptLog;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * (OptLog)表数据库访问层
 *
 * @author makejava
 * @since 2021-10-16 17:59:23
 */
public interface OptLogDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OptLog queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param optLog   查询条件
     * @param pageable 分页对象
     * @return 对象列表
     */
    List<OptLog> queryAllByLimit(OptLog optLog, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param optLog 查询条件
     * @return 总行数
     */
    long count(OptLog optLog);

    /**
     * 新增数据
     *
     * @param optLog 实例对象
     * @return 影响行数
     */
    int insert(OptLog optLog);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<OptLog> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<OptLog> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<OptLog> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<OptLog> entities);

    /**
     * 修改数据
     *
     * @param optLog 实例对象
     * @return 影响行数
     */
    int update(OptLog optLog);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}