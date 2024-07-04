package org.gradeSystemBackend.service;

import org.gradeSystemBackend.entity.dto.UpdateCourseGradeDTO;
import org.gradeSystemBackend.entity.vo.GetGradeVO;

public interface GradeService {
    GetGradeVO getCourseGrade(Integer studentId, Integer courseId);
    Integer updateCourseGrade(UpdateCourseGradeDTO updateCourseGradeDTO);
}
