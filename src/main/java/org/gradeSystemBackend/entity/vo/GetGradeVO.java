package org.gradeSystemBackend.entity.vo;

import lombok.Data;

@Data
public class GetGradeVO {
    /**
     * 课程名
     */
    private String courseName;

    /**
     * 老师姓名
     */
    private String teacherName;

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
