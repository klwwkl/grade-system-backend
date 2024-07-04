package org.gradeSystemBackend.service;

import org.gradeSystemBackend.entity.vo.CourseStudentListVO;
import org.gradeSystemBackend.entity.vo.TeacherCourseListVO;
import org.springframework.stereotype.Service;

@Service
public interface TeacherService {
    TeacherCourseListVO[] getTeacherCourseList(Integer teacherId);
    CourseStudentListVO[] getStudentList(Integer teacherId,Integer courseId);
}
