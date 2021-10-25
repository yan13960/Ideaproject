package cn.itnanls;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.CredentialsMatcher;
import org.apache.shiro.crypto.hash.Md5Hash;

/**
 *密码比较器
 */
public class MyMatcher implements CredentialsMatcher {
    @Override
    public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {
         //token 123
        //info zs adafafafafafa
        UsernamePasswordToken token1 =(UsernamePasswordToken)token ;
        SimpleAuthenticationInfo info1=(SimpleAuthenticationInfo)info;
        Md5Hash md5Hash=new Md5Hash(token1.getPassword(),info1.getCredentialsSalt());
        //计算hash
        if (info.getCredentials().equals(md5Hash.toString())){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Md5Hash md5Hash=new Md5Hash("123","231");

        System.out.println(md5Hash);
    }
}
