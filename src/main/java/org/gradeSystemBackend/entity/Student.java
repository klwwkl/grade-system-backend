package org.gradeSystemBackend.entity;

import lombok.Data;

@Data
public class Student {
    /**
     * 学生ID
     */
    private Integer id;

    /**
     * 学号
     */
    private Integer studentNumber;

    /**
     * 姓名
     */
    private String name;
}
