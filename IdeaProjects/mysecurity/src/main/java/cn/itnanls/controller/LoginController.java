package cn.itnanls.controller;

import cn.itnanls.core.Subject;
import cn.itnanls.core.UserNameAndPasswordToken;
import cn.itnanls.entity.LoginLog;
import cn.itnanls.entity.Permission;
import cn.itnanls.entity.Role;
import cn.itnanls.entity.User;
import cn.itnanls.core.exception.PasswordNotCorrectExcption;
import cn.itnanls.core.exception.UserNOTFoundException;
import cn.itnanls.core.exception.UserNamesIsEmptyExcption;
import cn.itnanls.service.LoginLogService;
import cn.itnanls.service.PermissionService;
import cn.itnanls.service.RoleService;
import cn.itnanls.service.UserService;
import cn.itnanls.util.R;
import cn.itnanls.util.ResultCode;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 */
@Controller
public class LoginController {

    @Resource
    private UserService userService;

    @Resource
    private RoleService roleService;

    @Resource
    private PermissionService permissionService;

    @Resource
    private LoginLogService loginLogService;

    public static Map<Integer ,HttpSession>map=new HashMap<>(11);

    @RequestMapping("/login")
    @ResponseBody
    public R Login(HttpSession session, User user) {
        try {
            Subject.login(user.getUsername(),user.getPassword());
            //记录登录日志
            loginLogService.insert(new LoginLog(0,user.getUsername(),new Date()));
        }catch (UserNamesIsEmptyExcption e){
           e.printStackTrace();
           return R.of(ResultCode.USERNAME_EMPTY);
        }catch (UserNOTFoundException e){
            e.printStackTrace();
            return R.of(ResultCode.USERNAME_ERROR);
        }catch (PasswordNotCorrectExcption e){
            e.printStackTrace();
            return R.of(ResultCode.PARAM_ERROR);
        }
       /* *//*
         * 1.对用户进行验证，用户名不能为空
         *//*
        String username = user.getUsername();
        if (StringUtils.isEmpty(username)) {
            throw new UserNamesIsEmptyExcption("用户名为空");
        }
        List<User> userByName = userService.findUserByName(username);
        //如果userByName里边没有数据，说明用户不存在
        if (userByName==null||userByName.size()==0){
            throw new UserNOTFoundException("用户没有找到");
        }
        //找到了用户 ，对比密码
        if (!userByName.get(0).getPassword().equals(user.getPassword())){
            throw new PasswordNotCorrectExcption("密码不正确");
        }
        session.setAttribute("user",user.getUsername());

        //查询角色放入session，根据用户拿到角色
        Integer uid = userByName.get(0).getId();
        List<Role> roles = roleService.getRolesByUserId(uid);
        //放入session
        *//*session.setAttribute("roles",roles);*//*
        session.setAttribute("roles",roles.stream().map(Role::getRoleName).collect(Collectors.toList()));
        //查询权限放入session
        List<Permission> permissions  = permissionService.getPermissionsByUserId(uid);
        //放入session
        //session.setAttribute("permissions",permissions);
        session.setAttribute("permissions",permissions.stream().map(Permission::getPermissionName).collect(Collectors.toList()));
       */ return R.of(ResultCode.SUCCESS);
    }
}

