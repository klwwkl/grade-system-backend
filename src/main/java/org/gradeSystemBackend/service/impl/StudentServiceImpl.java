package org.gradeSystemBackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.gradeSystemBackend.entity.Student;
import org.gradeSystemBackend.entity.User;
import org.gradeSystemBackend.entity.vo.StudentCourseListVO;
import org.gradeSystemBackend.mapper.StudentMapper;
import org.gradeSystemBackend.mapper.UserMapper;
import org.gradeSystemBackend.service.StudentService;
import org.gradeSystemBackend.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {
    @Override
    public StudentCourseListVO[] getStudentCourseList(Integer studentId) {
        return this.baseMapper.getStudentCourseList(studentId);
    }
}
