package org.gradeSystemBackend.entity.vo;

import lombok.Data;

@Data
public class CourseStudentListVO {
    /**
     * 学生id
     */
    private Integer studentId;
    /**
     * 学生姓名
     */
    private String studentName;
}
