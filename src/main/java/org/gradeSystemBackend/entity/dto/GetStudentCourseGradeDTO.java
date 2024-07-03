package org.gradeSystemBackend.entity.dto;

import lombok.Data;

@Data
public class GetStudentCourseGradeDTO {
    /**
     * 学生ID
     */
    private Integer studentId;

    /**
     * 课程ID
     */
    private Integer courseId;

    /**
     * 考试分数
     */
    private Integer examScore;

    /**
     * 平时分数
     */
    private Integer regularScore;

    /**
     * 额外分数
     */
    private Integer extraScore;

    /**
     * 总分数
     */
    private Integer totalScore;

    public String isValidate() {
        if (studentId == null) {
            return "学生ID不能为空";
        }
        if (courseId == null) {
            return "课程ID不能为空";
        }
        return "验证通过";
    }

}

