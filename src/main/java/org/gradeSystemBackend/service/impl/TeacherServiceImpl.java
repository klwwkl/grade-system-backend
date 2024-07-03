package org.gradeSystemBackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.gradeSystemBackend.entity.Teacher;
import org.gradeSystemBackend.entity.User;
import org.gradeSystemBackend.entity.vo.CourseStudentListVO;
import org.gradeSystemBackend.entity.vo.StudentCourseListVO;
import org.gradeSystemBackend.entity.vo.TeacherCourseListVO;
import org.gradeSystemBackend.mapper.TeacherMapper;
import org.gradeSystemBackend.mapper.UserMapper;
import org.gradeSystemBackend.service.TeacherService;
import org.gradeSystemBackend.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements TeacherService {

    @Override
    public TeacherCourseListVO[] getTeacherCourseList(Integer teacherId) {
        return this.baseMapper.getTeacherCourseList(teacherId);
    }

    @Override
    public CourseStudentListVO[] getCourseStudentList(Integer teacherId,Integer courseId) {
        return this.baseMapper.getCourseStudentList(teacherId,courseId);
    }
}
