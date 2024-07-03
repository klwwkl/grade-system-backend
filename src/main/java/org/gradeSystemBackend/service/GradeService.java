package org.gradeSystemBackend.service;

import org.gradeSystemBackend.entity.dto.GetStudentCourseGradeDTO;
import org.gradeSystemBackend.entity.vo.GetGradeVO;

public interface GradeService {
    GetGradeVO getStudentCourseGrade(Integer studentId, Integer courseId);
    Integer updateStudentCourseGrade(GetStudentCourseGradeDTO getStudentCourseGradeDTO);
}
