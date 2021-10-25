package cn.itnanls.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * (OptLog)实体类
 *
 * @author makejava
 * @since 2021-10-16 17:59:23
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class OptLog implements Serializable {
    private static final long serialVersionUID = 901520244083032271L;

    private Integer id;

    private String optUsername;

    private String optMsg;

    private Date optTime;


}