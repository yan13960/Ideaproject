package cn.itnanls.controller;

import cn.itnanls.core.annotation.HasPermission;
import cn.itnanls.core.annotation.OptLog;
import cn.itnanls.entity.User;
import cn.itnanls.service.UserService;
import cn.itnanls.util.R;
import cn.itnanls.util.ResultCode;
import org.apache.ibatis.annotations.Delete;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2021-10-10 16:01:38
 */
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;


    @RequestMapping("queryAll")
    public   List<User> queryUserAll(User user){
       return userService.queryAll(user);
    }
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    @OptLog("查询用户")
    public User  selectOne(@PathVariable Integer id){
        return this.userService.queryById(id);
    }

    @HasPermission("user:add")
    @PostMapping()
    public  R  userAdd(HttpSession session,User user){
       /* List<Permission> permissions = (List<Permission>) (session.getAttribute("permissions"));
        boolean contains = permissions.contains("user:add");
        if (!contains){
            throw  new  NotHasPermissionException("您没有该权限");
        }*/
        this.userService.insert(user);
        return R.of(ResultCode.SUCCESS);
    }

    @Delete("{id}")
    @HasPermission("user:delete")
    public R userDelete(@PathVariable Integer id){
        this.userService.deleteById(id);
        return R.of(ResultCode.SUCCESS);
    }

    @PutMapping("user")
    public R update(User user){
         this.userService.update(user);
        return R.of(ResultCode.SUCCESS);
    }
}