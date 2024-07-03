package org.gradeSystemBackend.service;

import org.gradeSystemBackend.entity.vo.GetGradeVo;

public interface GradeService {
    GetGradeVo getStudentCourseGrade(Integer studentId, Integer courseId);
}
