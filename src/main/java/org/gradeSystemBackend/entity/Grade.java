package org.gradeSystemBackend.entity;

import lombok.Data;

@Data
public class Grade {
    /**
     * 成绩ID
     */
    private Integer id;

    /**
     * 关联学生表id
     */
    private Integer studentID;

    /**
     * 关联教师表id
     */
    private Integer teacherID;

    /**
     * 关联课程表id
     */
    private Integer courseID;

    /**
     * 考试成绩
     */
    private Integer exam_score;

    /**
     * 平时成绩
     */
    private Integer regular_score;

    /**
     * 额外成绩
     */
    private Integer extra_score;

    /**
     * 总成绩
     */
    private Integer total_score;

}
