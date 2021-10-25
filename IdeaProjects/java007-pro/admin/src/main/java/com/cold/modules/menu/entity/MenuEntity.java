package com.cold.modules.menu.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 
 * </p>
 *
 * @author 
 * @since 2021-07-24
 */
@TableName("menu")
public class MenuEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 父节点，顶级节点0
     */
    private String pid;

    /**
     * 名称
     */
    private String name;

    /**
     * http://127.0.0.1{{uri}}
     */
    private String uri;

    /**
     * 图标
     */
    private String icon;

    /**
     * 1.超级管理员 2.次级管理员 3.商户
     */
    private Integer role;

    /**
     * 排序顺序，小的在上面
     */
    private Integer sort;

    /**
     * 子节点
     * @return
     */
    @TableField(exist = false)
    private List<MenuEntity> children;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public List<MenuEntity> getChildren() {
        return children;
    }

    public void setChildren(List<MenuEntity> children) {
        this.children = children;
    }

    public String getId() {
        return id;
    }

    public MenuEntity setId(String id) {
        this.id = id;
        return this;
    }
    public String getPid() {
        return pid;
    }

    public MenuEntity setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getName() {
        return name;
    }

    public MenuEntity setName(String name) {
        this.name = name;
        return this;
    }
    public String getUri() {
        return uri;
    }

    public MenuEntity setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getIcon() {
        return icon;
    }

    public MenuEntity setIcon(String icon) {
        this.icon = icon;
        return this;
    }
    public Integer getRole() {
        return role;
    }

    public MenuEntity setRole(Integer role) {
        this.role = role;
        return this;
    }
    public Integer getSort() {
        return sort;
    }

    public MenuEntity setSort(Integer sort) {
        this.sort = sort;
        return this;
    }

    @Override
    public String toString() {
        return "MenuEntity{" +
            "id=" + id +
            ", pid=" + pid +
            ", name=" + name +
            ", uri=" + uri +
            ", icon=" + icon +
            ", role=" + role +
            ", sort=" + sort +
        "}";
    }
}
