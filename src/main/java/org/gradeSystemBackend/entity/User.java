package org.gradeSystemBackend.entity;

import lombok.Data;

@Data
public class User {
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
     * 身份识别码 0-教师 1-学生
     */
    private String identity;

    /**
     * 关联学生表id
     */
    private String studentID;

    /**
     * 关联教师表id
     */
    private String teacherID;
}
