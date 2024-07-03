package org.gradeSystemBackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.gradeSystemBackend.entity.Grade;
import org.gradeSystemBackend.entity.Student;
import org.gradeSystemBackend.entity.vo.GetGradeVo;
import org.gradeSystemBackend.mapper.GradeMapper;
import org.gradeSystemBackend.mapper.StudentMapper;
import org.gradeSystemBackend.service.GradeService;
import org.gradeSystemBackend.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class GradeServiceImpl extends ServiceImpl<GradeMapper, Grade> implements GradeService {
    @Override
    public GetGradeVo getStudentCourseGrade(Integer studentId, Integer courseId) {
        return this.baseMapper.getStudentCourseGrade(studentId,courseId);
    }
}
