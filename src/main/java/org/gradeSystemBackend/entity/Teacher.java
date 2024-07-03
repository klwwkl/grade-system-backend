package org.gradeSystemBackend.entity;

import lombok.Data;

@Data
public class Teacher {
    /**
     * 教师ID
     */
    private Integer id;

    /**
     * 工号
     */
    private Integer teacherNumber;

    /**
     * 姓名
     */
    private String name;
}
