package org.gradeSystemBackend.entity.vo;

import lombok.Data;

@Data
public class UserLoginVO {
    /**
     * 用户姓名
     */
    private String name;

    /**
     * uid：teacherId或studentId
     */
    private Integer uid;
}
