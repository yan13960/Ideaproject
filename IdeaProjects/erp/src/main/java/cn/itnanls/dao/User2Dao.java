package cn.itnanls.dao;

import cn.itnanls.entity.User2;
import org.apache.ibatis.annotations.Param;


import java.awt.print.Pageable;
import java.util.List;

/**
 * (User2)表数据库访问层
 *
 * @author makejava
 * @since 2021-10-04 20:34:12
 */
public interface User2Dao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    User2 queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param user2    查询条件
     * @param
     * @return 对象列表
     */
    List<User2> queryAllByLimit(User2 user2);
    /**
     * 统计总行数
     *
     * @param user2 查询条件
     * @return 总行数
     */
    long count(User2 user2);

    /**
     * 新增数据
     *
     * @param user2 实例对象
     * @return 影响行数
     */
    int insert(User2 user2);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<User2> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<User2> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<User2> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<User2> entities);

    /**
     * 修改数据
     *
     * @param user2 实例对象
     * @return 影响行数
     */
    int update(User2 user2);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

