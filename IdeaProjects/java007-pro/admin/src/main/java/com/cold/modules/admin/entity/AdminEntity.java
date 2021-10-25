package com.cold.modules.admin.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 
 * @since 2021-07-24
 */
@TableName("admin")
public class AdminEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "admin_id", type = IdType.AUTO)
    private Integer adminId;

    /**
     * 管理员名称
     */
    private String adminNikename;

    /**
     * 管理员登录账号
     */
    private String adminName;

    /**
     * 管理员密码
     */
    private String adminPassword;

    /**
     * 管理员级别,0 超级管理员,1省代理,2 市代理
     */
    private String adminLevel;

    /**
     * 表示上下级关系
     */
    private Integer adminBoss;

    /**
     * 创建时间
     */
    private Date addTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    public Integer getAdminId() {
        return adminId;
    }

    public AdminEntity setAdminId(Integer adminId) {
        this.adminId = adminId;
        return this;
    }
    public String getAdminNikename() {
        return adminNikename;
    }

    public AdminEntity setAdminNikename(String adminNikename) {
        this.adminNikename = adminNikename;
        return this;
    }
    public String getAdminName() {
        return adminName;
    }

    public AdminEntity setAdminName(String adminName) {
        this.adminName = adminName;
        return this;
    }
    public String getAdminPassword() {
        return adminPassword;
    }

    public AdminEntity setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
        return this;
    }
    public String getAdminLevel() {
        return adminLevel;
    }

    public AdminEntity setAdminLevel(String adminLevel) {
        this.adminLevel = adminLevel;
        return this;
    }
    public Integer getAdminBoss() {
        return adminBoss;
    }

    public AdminEntity setAdminBoss(Integer adminBoss) {
        this.adminBoss = adminBoss;
        return this;
    }
    public Date getAddTime() {
        return addTime;
    }

    public AdminEntity setAddTime(Date addTime) {
        this.addTime = addTime;
        return this;
    }
    public Date getUpdateTime() {
        return updateTime;
    }

    public AdminEntity setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    @Override
    public String toString() {
        return "AdminEntity{" +
            "adminId=" + adminId +
            ", adminNikename=" + adminNikename +
            ", adminName=" + adminName +
            ", adminPassword=" + adminPassword +
            ", adminLevel=" + adminLevel +
            ", adminBoss=" + adminBoss +
            ", addTime=" + addTime +
            ", updateTime=" + updateTime +
        "}";
    }
}
