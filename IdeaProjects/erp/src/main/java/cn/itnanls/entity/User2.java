package cn.itnanls.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (User2)实体类
 *
 * @author makejava
 * @since 2021-10-04 20:34:13
 */
public class User2 implements Serializable {
    private static final long serialVersionUID = 377169833244636295L;

    private Integer id;

    private String username;

    private String password;

    private Date birthday;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

}

