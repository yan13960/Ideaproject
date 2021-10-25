package cn.itnanls;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.SimpleByteSource;

import java.util.Arrays;

/**
 *
 */
public class JdbcRealm extends AuthorizingRealm {
    //获取授权信息
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        String username =(String) principals.getPrimaryPrincipal();
        System.out.println("需要认证的用户名"+username);

        //从数据库 根据用户名查出角色
        //select *from user u left join user_role ur on.....
        SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
        info.addRoles(Arrays.asList("admin","manger"));

        //从数据库 根据用户查询权限信息
        info.addStringPermissions(Arrays.asList("user:add","user:delete"));

        return info;
    }

    //获取认证信息
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
      UsernamePasswordToken myToken= (UsernamePasswordToken) token;
        String username = myToken.getUsername();

        //去数据库里边查出密码
        String pass = "123";
        String salt="234";
        SimpleByteSource  byteSource=new SimpleByteSource(salt);
        SimpleAuthenticationInfo info =
                new SimpleAuthenticationInfo(username,pass,byteSource,getName());
        return info;
    }


}
