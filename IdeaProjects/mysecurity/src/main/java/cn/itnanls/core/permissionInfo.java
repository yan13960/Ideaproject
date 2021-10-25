package cn.itnanls.core;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 *用来存储权限信息
 */
@AllArgsConstructor
@Data
@NoArgsConstructor
public class permissionInfo {

    private List<String> roles;
    private  List<String> permissions;
}
