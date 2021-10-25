package cn.itnanls.security;

import cn.itnanls.core.Realm;
import cn.itnanls.core.UserNameAndPasswordToken;
import cn.itnanls.core.exception.UserNOTFoundException;
import cn.itnanls.core.exception.UserNamesIsEmptyExcption;
import cn.itnanls.core.permissionInfo;
import cn.itnanls.entity.Permission;
import cn.itnanls.entity.Role;
import cn.itnanls.entity.User;
import cn.itnanls.service.PermissionService;
import cn.itnanls.service.RoleService;
import cn.itnanls.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;


import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 */
@Component
public class UserRealm  implements Realm {
    @Resource
    private UserService userService;
    @Resource
    private RoleService roleService;
    @Resource
    private PermissionService permissionService;
    @Override
    public UserNameAndPasswordToken authentication(String username) {

        if (StringUtils.isEmpty(username)) {
            throw new UserNamesIsEmptyExcption("用户名为空");
        }
        List<User> userByName = userService.findUserByName(username);
        //如果userByName里边没有数据，说明用户不存在
        if (userByName==null || userByName.size()==0){
            throw new UserNOTFoundException("用户没有找到");
        }
        return new UserNameAndPasswordToken(userByName.get(0).getUsername(),
                userByName.get(0).getPassword());
    }

    @Override
    public permissionInfo authorization(String username) {
        //查询出所有的权限和角色 包装成permissionInfo
        List<Permission> permissions = permissionService.getPermissionsByUserName(username);
        List<String> permissionStrings = permissions.stream().map(Permission::getPermissionName).collect(Collectors.toList());
        List<Role> roles = roleService.getRolesByUsername(username);
        List<String> roleStrings = roles.stream().map(Role::getRoleName).collect(Collectors.toList());
        permissionInfo permissionInfo = new permissionInfo();
        permissionInfo.setRoles(roleStrings);
        permissionInfo.setPermissions(permissionStrings);
        return  permissionInfo;
    }
}
