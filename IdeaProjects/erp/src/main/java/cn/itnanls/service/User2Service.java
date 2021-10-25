package cn.itnanls.service;

import cn.itnanls.config.PageRequest;
import cn.itnanls.entity.User2;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;


/**
 * (User2)表服务接口
 *
 * @author makejava
 * @since 2021-10-04 20:34:13
 */
public interface User2Service {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    User2 queryById(Integer id);


    /**
     * 新增数据
     *
     * @param user2 实例对象
     * @return 实例对象
     */
    User2 insert(User2 user2);

    /**
     * 修改数据
     *
     * @param user2 实例对象
     * @return 实例对象
     */
    User2 update(User2 user2);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    /**
     * 用户的分页查询
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageInfo<User2> getPage(Integer pageNum,Integer pageSize);

}
