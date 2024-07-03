package org.gradeSystemBackend.service;

import org.gradeSystemBackend.entity.dto.UserLoginDTO;
import org.gradeSystemBackend.entity.vo.StudentCourseListVO;
import org.gradeSystemBackend.entity.vo.UserLoginVO;

public interface StudentService {
    StudentCourseListVO[] getStudentCourseList(Integer studentId);
}
