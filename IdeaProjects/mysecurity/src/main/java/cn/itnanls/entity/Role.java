package cn.itnanls.entity;

import java.io.Serializable;

/**
 * (Role)实体类
 *
 * @author makejava
 * @since 2021-10-10 16:01:38
 */
public class Role implements Serializable {
    private static final long serialVersionUID = 682061061514566978L;

    private Integer id;

    private String roleName;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

}