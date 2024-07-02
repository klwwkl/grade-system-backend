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
    private Integer student_number;

    /**
     * 姓名
     */
    private String name;
}
