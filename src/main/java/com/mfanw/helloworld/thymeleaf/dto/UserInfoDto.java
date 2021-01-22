package com.mfanw.helloworld.thymeleaf.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author mengwei
 */
@Getter
@Setter
@ToString
public class UserInfoDto implements Serializable {

    /**
     * 用户ID
     */
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 用户爱好
     */
    List<String> hobbies;

    /**
     * 用户隐私
     */
    Map<String, String> secrets;

    /**
     * 用户状态：true可用，false禁用
     */
    private Boolean status;
}
