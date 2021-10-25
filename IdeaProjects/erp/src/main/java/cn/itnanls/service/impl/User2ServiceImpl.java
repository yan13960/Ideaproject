package cn.itnanls.service.impl;

import cn.itnanls.config.PageRequest;
import cn.itnanls.entity.User2;
import cn.itnanls.dao.User2Dao;
import cn.itnanls.service.User2Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;

/**
 * (User2)表服务实现类
 *
 * @author makejava
 * @since 2021-10-04 20:34:13
 */
@Service("user2Service")
public class User2ServiceImpl implements User2Service {
    @Resource
    private User2Dao user2Dao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public User2 queryById(Integer id) {
        return this.user2Dao.queryById(id);
    }



    /**
     * 新增数据
     *
     * @param user2 实例对象
     * @return 实例对象
     */
    @Override
    public User2 insert(User2 user2) {
        this.user2Dao.insert(user2);
        return user2;
    }

    /**
     * 修改数据
     *
     * @param user2 实例对象
     * @return 实例对象
     */
    @Override
    public User2 update(User2 user2) {
        this.user2Dao.update(user2);
        return this.queryById(user2.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.user2Dao.deleteById(id) > 0;
    }

    @Override
    public PageInfo<User2> getPage(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<User2> user2s = user2Dao.queryAllByLimit(new User2());
        return new PageInfo<>(user2s);

    }
}
