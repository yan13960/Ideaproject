package cn.itnanls.controller;

import cn.itnanls.core.Subject;
import cn.itnanls.entity.Permission;
import cn.itnanls.entity.User;
import cn.itnanls.service.PermissionService;
import cn.itnanls.service.RoleService;
import cn.itnanls.service.UserService;
import cn.itnanls.util.R;
import cn.itnanls.util.ResultCode;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * (Permission)表控制层
 *
 * @author makejava
 * @since 2021-10-10 16:01:35
 */
@RestController
@RequestMapping("permission")
public class PermissionController {
    /**
     * 服务对象
     */
    @Resource
    private PermissionService permissionService;
    @Resource
    private UserService userService;

    /**
     * 分页查询
     *
     * @param permission  筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Permission>> queryByPage(Permission permission, PageRequest pageRequest) {
        return ResponseEntity.ok(this.permissionService.queryByPage(permission, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Permission> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.permissionService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param permission 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Permission> add(Permission permission) {
        return ResponseEntity.ok(this.permissionService.insert(permission));
    }

    /**
     * 编辑数据
     *
     * @param permission 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Permission> edit(Permission permission) {
        return ResponseEntity.ok(this.permissionService.update(permission));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.permissionService.deleteById(id));
    }

    @GetMapping("allocation")
    public R update(Integer rId,Integer pId){
          permissionService.allocation(rId,pId);
          //你修改的那些权限
          //通过roleId拿到所有使用了这些权限的用户
          List<User> users= userService.getUsersByRoleId(rId);
         //拿到所有的在线用户
         Map<String, HttpSession> online = Subject.getOnline();
        //从online 看一看谁有这个权限 谁有把谁的权限重新加载
        Set<String> onlines = online.keySet();
        for (String onlineUser : onlines) {
            for (User user : users) {
                //这个在线的用户有这个角色
                if (onlineUser.equals(user.getUsername())){
                 //重新加载权限
                    Subject.reloadPermission(onlineUser);
                }
                break;
            }
        }
        return R.of(ResultCode.SUCCESS);
    }
}