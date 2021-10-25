package cn.itnanls.entity;

import java.io.Serializable;

/**
 * (Permission)实体类
 *
 * @author makejava
 * @since 2021-10-10 16:01:36
 */
public class Permission implements Serializable {
    private static final long serialVersionUID = 397511198390814644L;

    private Integer id;

    private String permissionName;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

}