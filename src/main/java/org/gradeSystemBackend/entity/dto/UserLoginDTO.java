package org.gradeSystemBackend.entity.dto;

import lombok.Data;
import org.springframework.util.Assert;

import java.util.Objects;

@Data
public class UserLoginDTO {
    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 身份识别码
     */
    private String identity;

    public void isValidate() {
        Assert.isTrue(username != null && !username.isEmpty(), "用户名不得为空");
        Assert.isTrue(password != null && !password.isEmpty(), "口令不得为空");
        Assert.isTrue(identity != null && !identity.isEmpty(), "口令不得为空");
    }
}
