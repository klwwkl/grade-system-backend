package org.gradeSystemBackend.entity.vo;

import lombok.Data;

@Data
public class StudentCourseListVO {
    /**
     * 课程id
     */
    private Integer courseId;

    /**
     * 课程名
     */
    private String courseName;
}
