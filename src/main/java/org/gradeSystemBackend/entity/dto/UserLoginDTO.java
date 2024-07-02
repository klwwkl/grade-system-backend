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

    public String isValidate() {
        StringBuilder errors = new StringBuilder();

        if (username == null || username.isEmpty()) {
            errors.append("用户名不能为空\n");
        }
        if (password == null || password.isEmpty()) {
            errors.append("口令不能为空\n");
        }
        if (identity == null || identity.isEmpty()) {
            errors.append("身份识别码不能为空\n");
        }

        if (errors.length() == 0) {
            return "验证通过";
        } else {
            return errors.toString();
        }
    }

}
