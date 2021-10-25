package cn.itnanls.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * (LoginLog)实体类
 *
 * @author makejava
 * @since 2021-10-16 17:59:22
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class LoginLog implements Serializable {
    private static final long serialVersionUID = -89453876179352254L;

    private Integer id;

    private String loginUsername;

    private Date loginTime;



}