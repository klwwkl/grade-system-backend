package org.gradeSystemBackend.entity;

import lombok.Data;

@Data
public class Course {
    /**
     * 课程ID
     */
    private Integer id;

    /**
     * 课程名
     */
    private String courseName;

    /**
     * 关联教师id
     */
    private String teacherID;
}
