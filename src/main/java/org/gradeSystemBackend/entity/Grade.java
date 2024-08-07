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
    private Integer examScore;

    /**
     * 平时成绩
     */
    private Integer regularScore;

    /**
     * 额外成绩
     */
    private Integer extraScore;

    /**
     * 总成绩
     */
    private Integer totalScore;

}
