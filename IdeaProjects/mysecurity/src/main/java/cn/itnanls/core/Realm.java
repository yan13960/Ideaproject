package cn.itnanls.core;

/**
 *认证和授权的核心
 */
public interface Realm {

    //查询用户信息
    UserNameAndPasswordToken authentication(String username);

    //查询权限信息
    permissionInfo   authorization(String username);


}
