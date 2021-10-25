package cn.itnanls.core;

import cn.itnanls.core.exception.PasswordNotCorrectExcption;
import cn.itnanls.core.exception.UserNOTFoundException;
import cn.itnanls.core.exception.UserNamesIsEmptyExcption;
import cn.itnanls.entity.Permission;
import cn.itnanls.entity.Role;
import cn.itnanls.entity.User;
import cn.itnanls.util.R;
import cn.itnanls.util.ResultCode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.thymeleaf.util.StringUtils;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 */
@Component
public class Subject {
    @Resource
    private  Realm realm;

    private static  Realm myRealm;

    private final static Map<String ,HttpSession>ONLINE_SESSION =new HashMap<>(16);

    @PostConstruct
    public void init(){
        myRealm=realm;
    }

    public  static  void login(String name,String pwd){
        /*
         * 1.对用户进行验证，用户名不能为空
         */
        UserNameAndPasswordToken token = myRealm.authentication(name);
        String username =token.getUsername();

        boolean usernameIsExist = ONLINE_SESSION.containsKey(username);

        if (usernameIsExist){
            //让session失效
            ONLINE_SESSION.get(username).invalidate();

            ONLINE_SESSION.remove(username);
        }

        //找到了用户 ，对比密码
        if (!token.getPassword().equals(pwd)){
            throw new PasswordNotCorrectExcption("密码不正确");
        }
        getSession().setAttribute("user",token.getUsername());
        ONLINE_SESSION.put(token.getUsername(),getSession());
        //加载权限到session
        reloadPermission(username);
    }
    public  static HttpSession getSession(){
        //获取session
        ServletRequestAttributes sra=(ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpSession session=sra.getRequest().getSession();
        return session;
    }

    public static Map<String ,HttpSession> getOnline(){
        return ONLINE_SESSION;
    }

    //加载权限到session
    public static void reloadPermission(String username) {
        //重新加载一下
        ONLINE_SESSION.get(username).setAttribute("roles",myRealm.authorization(username).getRoles());
        ONLINE_SESSION.get(username).setAttribute("permissions",myRealm.authorization(username).getPermissions());

    }
}
