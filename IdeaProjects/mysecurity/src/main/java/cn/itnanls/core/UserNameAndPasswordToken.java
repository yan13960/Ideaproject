package cn.itnanls.core;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@AllArgsConstructor
@Data
@NoArgsConstructor
public class UserNameAndPasswordToken {

    private String username;
    private String password;

}
